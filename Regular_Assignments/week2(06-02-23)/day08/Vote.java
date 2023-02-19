import java.util.*;
class Vote{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    System.out.println("enter your age");
    if(age>=18)
    {
      System.out.println("hooooo.., you are eligible for vote");
    }
    else{
      System.out.println("sorry you are not eligible");
    }
  }
}