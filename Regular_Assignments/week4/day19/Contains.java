import java.util.*;
class Contains{
  static void contains(String str){
    if(str.contains("@")){
      System.out.println("valid");
    }
    else{
      System.out.println("invalid");
      }
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter email id");
    String str = sc.nextLine();
    contains(str);
  }
}