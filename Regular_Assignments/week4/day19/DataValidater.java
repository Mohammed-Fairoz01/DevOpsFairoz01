// 4. Data validator: Create a menu based application that can display list of options:
//                 --> Email Verifier: Create a method that takes an email address as input and verifies if it is in the correct format using regular expressions.
//                 --> Username and password Verifier: Create a method that takes an username and password as input and verifies these are following basic rules                       (having 1 uppercase, lowercase, 1 digit, 1 special character etc....)
//                 --> Mobile number Verifier: Create a method that  takes a mobile number as input and verifies it contains only digits or not, length should be 10                      digits, starts with 6 or 7 or 8 or 9.

import java.util.regex.Matcher;
import java.util.regex.pattern;
class DataValidater{
  static void dataVal(String email){
  String emailPattern = ^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-])
    if(email.startsWith()){
      System.out.println("valid");
    }
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      System.out.println("enter email id");
   String email = sc.nextLine();
   // String emailPattern;
    dataVal(email);
  }
}