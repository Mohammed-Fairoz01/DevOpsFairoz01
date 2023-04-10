import java.util.logging.*;
class HighestMethod1{
  static int maxNumber(int num1, int num2){
    if(num1>num2){
      return num1;
    }
    else{
      return num2;
    }
     public static void main(String args[]){
      int max = HighestMethod1.maxNumber(12, 45);
      System.out.println(max);
  }
}