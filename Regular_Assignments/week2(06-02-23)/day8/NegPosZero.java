import java.util.*;
class negPosZero{
  public static void main(String args[]){
    System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num>0){
      System.out.println("number is positive");
      if (num<0) {
        System.out.println("number is negative");
} else {
        System.out.println("number is zero");
}
    }
  }
}