import java.util.*;
class EvenOdd{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("enter number");
    if(num%2==0)
    {
      System.out.println("it's even number");
    }
    else{
      System.out.println("it's odd number");
    }
  }
}