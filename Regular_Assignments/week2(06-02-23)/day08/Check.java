import java.util.*;
class Check{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    System.out.println("enter the element");
    char alp = sc.next().charAt(0);
    if((alp>='a' && alp<= 'z') || (alp>='A' && alp<='Z'))
    {
      System.out.println("yes, it's alphabet");
    }
    else if((alp>=0) && (alp<=0)){
      System.out.println("it's digit");
    }
    else{
      System.out.println("it's special char");
    }
  }
}