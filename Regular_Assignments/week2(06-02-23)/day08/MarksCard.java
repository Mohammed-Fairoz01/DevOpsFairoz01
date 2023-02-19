import java.util.*;
class MarksCard{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 5 subject mark");
    double phy=sc.nextDouble();
    double chem=sc.nextDouble();
    double maths=sc.nextDouble();
    double Bio=sc.nextDouble();
    double cs=sc.nextDouble();
    double Total = (phy + chem + maths + Bio +cs);
    double per = ((Total)/500)*100;
    if(per>= 90){
      System.out.println("Grade A");
    }
    else if((per>= 80) && (per<90)){
      System.out.println("Grade B");
    }
      else if((per>= 70) && (per< 80)){
      System.out.println("Grade C");
    }
        else if((per>= 60) && (per< 70)){
      System.out.println("Grade D");
    }
          else if((per>= 40) && (per< 60)){
      System.out.println("Grade B");
    }
    else{
      System.out.println("Grade F");
    }
     System.out.println("Percentage is = " + per);
     System.out.println(Total);
  }
}