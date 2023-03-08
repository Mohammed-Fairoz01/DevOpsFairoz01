import java.util.*;
class EncryptedString {
  public static void main(String[] args) 
  {
    String str;
    String str1 = "", str2 = "";
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    str = sc.next();
    for (int i = 0; i < str.length(); i++) {
      if (i % 2 == 0) 
      {
        str1 = str1 + str.charAt(i);
      }
      else 
      {
        str2 = str2 + str.charAt(i);
      }
    }
    System.out.println("Encrypted String is :" + str1 + str2);
  }
}