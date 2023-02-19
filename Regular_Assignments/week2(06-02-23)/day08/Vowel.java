import java.util.*;
class Vowel{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    System.out.println("enter alpha only in small case");
    char alp = sc.next().charAt(0);
    if(alp == 'a' || alp =='e' || alp == 'i' || alp == 'o' || alp == 'u')
    {
      System.out.println("yes it's vowel");
    }
    else{
      System.out.println("it's not vowel");
    }
  }
}