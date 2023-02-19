import java.util.*;
class CheckUpLw{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    System.out.println("enter the alphabet");
    char alp = sc.next().charAt(0);
    if(alp>='a' && alp<= 'z')
    {
      System.out.println("it's uppercase alphabet");
    }
    else{
      System.out.println("it's lower case alphabet");
    }
  }
}