import java.util.*;
class leap{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if(year%4==0)
    {
      System.out.println("it's leap year");
    }
    else{
      System.out.println("it's not leap year");
    }
  }
}