import java.util.*;
class FindSubString{
  // static String str;
  static void subString(String str){
    if(str.startsWith("f")&&(str.endsWith(".com"))){
      System.out.println("valid");
    }
    else{
      System.out.println("invalid");
    }
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Email ID");
    String str =sc.nextLine();
    subString(str);
  }
}