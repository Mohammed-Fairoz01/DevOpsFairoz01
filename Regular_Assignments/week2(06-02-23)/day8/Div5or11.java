import java.util.*;
class Div5or11{
  public static void main(String args[]){
    System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if (num%5==0&&num%11==0) {
     System.out.println("it is divisible by both 5 and 11");
}
     else if(num%5==0) {
        System.out.println("it is divisible by both 5");
} else if(num%11==0){
        System.out.println("it is divisible by 11");
}
    else{
      System.out.println("it's not divisible by both 5 and 11");
    }
  }
}
  