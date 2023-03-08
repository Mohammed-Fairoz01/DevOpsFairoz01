import java.util.*;
class StringReplacer{
  static void replace(String str, String newSubstring){
    
    String newString = str.replace(str, newSubstring);
    System.out.println(newString);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter original word");
    String str = sc.nextLine();
    System.out.println("enter replacing word");
    String newSubstring = sc.nextLine();
    
    replace(str, newSubstring);
  }
  
}