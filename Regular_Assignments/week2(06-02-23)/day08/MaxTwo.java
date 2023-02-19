import java.util.*;
class MaxTwo{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two number");
    int num1,num2 =sc.nextInt();
    if(num1>num2){
      System.out.println("num1 is bigger");
    }
    else{
      System.out.println("num2 is max");
    }
  }
}