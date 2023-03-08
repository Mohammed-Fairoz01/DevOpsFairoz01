import java.util.*;
class PositiveNumber{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        double a[] = new double[5];
    System.out.println("enter the element to the array");
    for (int i=0; i<5; i++) {
      a[i]=sc.nextDouble();
}
    for (int i = 0; i<5; i++) {
      if(a[i]>0){
        System.out.println(a[i]);
      }
}
  }
}