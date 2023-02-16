import java.util.*;

class IncomeTax {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your salary");
    double salary = sc.nextDouble();
    double anualSalary, tax=0 ,netSalary;
    anualSalary = salary*12;
    if(anualSalary>= 300000 && anualSalary <600000 ) {
        tax = anualSalary*0.05;
    }
    else if(anualSalary>= 600000 && anualSalary <900000 ) {
        tax = anualSalary*0.1;
    } 
    else if(anualSalary>= 900000 && anualSalary <1200000 ) {
        tax = anualSalary*0.15;
    }
    else if(anualSalary>= 1200000 && anualSalary <1500000 ) {
        tax = anualSalary*0.2;
    }
    else if(anualSalary> 1500000) {
        tax = anualSalary*0.3;
    }
    netSalary = anualSalary-tax;
    System.out.println("Income Tax is = " + tax);
    System.out.println("Anual Salary is :" + netSalary);
  }
}