import java.util.*;

class Hospital {
  private String id;
  private String name;
  private int age;
  private String gender;
  private String adharNum;
  private String mobNum;
  private String city;
  private String address;
  private String doa;
  private String guardianName;
  private String guardianAddress;
  private String guardianContactNum;

  public Hospital(String id, String name, int age, String gender, String adharNum, String mobNum, String city, String address, String doa, String guardianName, String guardianAddress, String guardianContactNum) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.adharNum = adharNum;
    this.mobNum = mobNum;
    this.city = city;
    this.address = address;
    this.doa = doa;
    this.guardianName = guardianName;
    this.guardianAddress = guardianAddress;
    this.guardianContactNum = guardianContactNum;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public String getAdharNum() {
    return adharNum;
  }

  public String getMobNum() {
    return mobNum;
  }

  public String getCity() {
    return city;
  }

  public String getAddress() {
    return address;
  }

  public String getDoa() {
    return doa;
  }

  public String getGuardianName() {
    return guardianName;
  }

  public String getGuardianAddress() {
    return guardianAddress;
  }

  public String getGuardianContactNum() {
    return guardianContactNum;
  }

  public String toString() {
    return id + " " + name + " " + age + " " + gender + " " + adharNum + " " + mobNum + " " + city + " " + address + " " + doa + " " + guardianName + " " + guardianAddress + " " + guardianContactNum;
  }
}

class PatientList {
  private ArrayList<Hospital> patientList = new ArrayList<>();

  public void addPatient(Hospital patient) {
    patientList.add(patient);
  }

  public void removePatient(String id) {
    for (Hospital hospital : patientList) {
      if (hospital.getId().equals(id)) {
        patientList.remove(hospital);
        System.out.println("Patient removed successfully");
        return;
      }
    }
    System.out.println("Patient not found");
  }

  public Hospital getPatientById(String id) {
    for (Hospital hospital : patientList) {
      if (hospital.getId().equals(id)) {
        return hospital;
      }
    }
    return null;
  }

  public List<Hospital> getPatientsByCity(String city) {
    List<Hospital> patients = new ArrayList<>();
    for (Hospital hospital : patientList) {
      if (hospital.getCity().equals(city)) {
        patients.add(hospital);
      }
    }
    return patients;
  }
  public List<Hospital> getPatientsByName(String name) {
    List<Hospital> patients = new ArrayList<>();
    for (Hospital hospital : patientList) {
      if (hospital.getName().equals(name)) {
        patients.add(hospital);
      }
    }
    return patients;
  }

  public List<Hospital> getPatientsByAgeRange(int minAge, int maxAge) {
    List<Hospital> patients = new ArrayList<>();
    for (Hospital hospital : patientList) {
      if (hospital.getAge() >= minAge && hospital.getAge() <= maxAge) {
        patients.add(hospital);
      }
    }
    return patients;
  }
}

public class HospitalManagement {
public static void main(String[] args) {
    PatientList patientList = new PatientList();
    Scanner sc = new Scanner(System.in);
  System.out.println("********************Welcome to Arogya Hospital*******************************");
    System.out.println("Enter how many patients you want to add");
    int n = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter patient details:");
    for(int i=0; i<n; i++){
      System.out.println("Enter the unique id:");
      String id = sc.nextLine();
      System.out.println("Enter the patient name:");
      String name = sc.nextLine();
      System.out.println("Enter the age:");
      int age = sc.nextInt();
      while(age<1||age>99){
        System.out.println("Age must be between 0 to 99");
        age = sc.nextInt();
      }
      sc.nextLine();
      System.out.println("Enter the gender:");
      String gender = sc.nextLine();  
      System.out.println("Enter the Adhar number:");
      String adharNum = sc.nextLine();     
      while(adharNum.length()!=12){
        System.out.println("Adhar card number must be 12 digit can u retry");
        adharNum = sc.nextLine();
      }
      System.out.println("Enter the mobile number:");
      String MobNum = sc.nextLine();
      while(MobNum.length()!=10){
        System.out.println("Mobile number must be 10 digit can u retry");
        MobNum = sc.nextLine();
      }
      System.out.println("Enter the city name:");
       String city = sc.nextLine();  
      System.out.println("Enter the address of the patient:");
      String address = sc.nextLine();    
      System.out.println("Enter the date of admission:");
      String doa = sc.nextLine();     
      System.out.println("Enter the guardian name:");
      String gName = sc.nextLine();     
      System.out.println("Enter the guardian address:");
      String gAddress = sc.nextLine();    
      System.out.println("Enter the guardian contact number:");
      String gContNum = sc.nextLine();    
      while(gContNum.length()!=10){
        System.out.println("Mobile number must be 10 digit can u retry");
        gContNum = sc.nextLine();
      }
      Hospital patient = new Hospital(id,name,age,gender,adharNum,MobNum,city,address,doa,gName,gAddress,gContNum);
     patientList.addPatient(patient);
    }
    boolean exit=false;
    while(!exit){
    System.out.println("Enter the choice You want");
    System.out.println("1 for Enter the patient id you want to remove:");
    System.out.println("2 for display all patient details by there age");
    System.out.println("3 for Enter the patient name u want to search");
    System.out.println("4 for enter the patient id u want to search");
    System.out.println("5 for enter the patient city u want to search");
      System.out.println("6 for exit");
    int choice = sc.nextInt();
    switch(choice){
      case 1:
         System.out.println("Enter the patient u wnat remove");
    patientList.removePatient(sc.next());
      case 2:
        System.out.println("Search Patient by age group");
        List<Hospital> patientsByAgeRange = patientList.getPatientsByAgeRange(sc.nextInt(), sc.nextInt());
    System.out.println("Patients by age range: " + patientsByAgeRange);
      case 3:
        System.out.println("enter name");
         List<Hospital> patientsByName = patientList.getPatientsByName(sc.next());
    System.out.println("Patients by name: " + patientsByName);
      case 4:
         System.out.println("Search Patient by id");
    Hospital patientById = patientList.getPatientById(sc.next());
    System.out.println("Patient by ID: " + patientById);
      case 5:
        System.out.println("Search Patient by city");
    List<Hospital> patientsByCity = patientList.getPatientsByCity(sc.next());
    System.out.println("Patients by city: " + patientsByCity);
      case 6:
        System.out.println("exit");
        exit = true;
        break;
      default:
        System.out.println("invalid");
        break;
    }
    }
}
}