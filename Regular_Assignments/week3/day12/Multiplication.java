import java.util.*;
class Multiplication{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the nuber");
    int n,i;
    n = sc.nextInt();
    for(i=1; i<=10; i++){
      System.out.println(n +"*" +i+ "= " + n*i);
    }
  }
}
