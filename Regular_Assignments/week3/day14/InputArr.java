import java.util.*;
class InputArr{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    double arr[] =new double[5];
    System.out.println("enter the array elements");
    for(int i =0; i<5;i++){
      arr[i]=sc.nextDouble();
    }
    System.out.println("Array elements are");
    for(int i=0;i<5;i++){
      System.out.println(arr[i]);
    }
  }
}