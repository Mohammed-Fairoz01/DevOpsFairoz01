import java.util.*;
class NextString{
  static String str1,str2;
  static void compareString(){
    if(str1.equals(str2)){
      System.out.println("Strings are equal");
    }else{
    System.out.println("strings are not equal");
  }
  }
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
   // String str1,str2;
    System.out.println("enter first value to the string");
    str1 = sc.nextLine();
    System.out.println("enter second value");
        str2 = sc.nextLine();
    compareString();
  }
}