import java.util.*;
class CheckAlpha{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    System.out.println("enter the alphabet");
    char alp = sc.next().charAt(0);
    if((alp>='a' && alp<= 'z') || (alp>='A' && alp<=Z))
    {
      System.out.println("yes, it's alphabet");
    }
    else{
      System.out.println("no it's not alphabet");
    }
  }
}