import java.util.*;
class SubStringVowel{
  static String str,subString;
  static int count=0;
  static void CheckSubString(){
    char a[] = {'a', 'e', 'i', 'o', 'u'};
    String str1=new String(a);
    for(int i=0; i<str.length()-1; i++){
    if(str.charAt(i)==str1.charAt(i)){
      // System.out.println("Valid");
      count++;
    }    
    // else{
    //   System.out.println("Invalid");
    // }
  }
  }
  public static void main(String args[]){
    System.out.println("enter the word");
    Scanner sc = new Scanner(System.in);
    str = sc.nextLine();
    //  System.out.println("Eneter the word");
    // subString = sc.nextLine();
    System.out.println(count);
    CheckSubString();
  }
}