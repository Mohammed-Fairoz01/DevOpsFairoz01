import java.util.*;
class IntIpt{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int a = sc.nextInt();
    System.out.println("enter character");
    char c = sc.next().charAt(0);
    System.out.println("entre double");
    double b = sc.nextDouble();
    System.out.println("boolean");
    boolean d =sc.nextBoolean();
    System.out.println("integer = " +a);
    System.out.println("double = " +b);
    System.out.println("char = " +c);
    System.out.println("boolean = " +d);
  }
}