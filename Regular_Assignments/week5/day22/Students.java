public class Students {
  int id;
  String name;
  String branch;
  double sub1, sub2, sub3;

  void average() {
    double avg = (sub1 + sub2 + sub3) / 3;
    System.out.println(name + " average is" + avg);
  }

  void percentage() {
    double totalmarks = sub1 + sub2 + sub3;
    double per = (totalmarks / 300) * 100;
    System.out.println(name + " per is" + per);
  }

  public static void main(String args[]) {
    Students st1 = new Students();
    st1.id = 1234;
    st1.name = "Alvin";
    st1.branch = "CSE";
    st1.sub1 = 45;
    st1.sub2 = 67;
    st1.sub3 = 89;
    st1.average();
    st1.percentage();

  }
}
