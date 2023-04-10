import java.util.*;
class Concate{
  static String str,compare;
  static void CheckSubString(){
    if(str.contains(compare)){
      System.out.println("Valid");
    }    
    else{
      System.out.println("Invalid");
    }
  }
  public static void main(String args[]){
    System.out.println("enter the sentence");
    Scanner sc = new Scanner(System.in);
    str = sc.nextLine();
    System.out.println("Eneter the word");
    compare = sc.nextLine();
    CheckSubString();
  }
}