import java.util.*;
class Formate{
public static void main(String args[]){
  float n1=223.56f,n2=355.67f;
  float total=n1*n2;
  String result1=String.format("%-15.2f%-15.2s%-15.2",total,total,total);
    System.out.println(result1);  
  String result2=String.format("%-15.2f%-15.2s%-15.2",total,total,total);
      System.out.println(result2);
  
}
}