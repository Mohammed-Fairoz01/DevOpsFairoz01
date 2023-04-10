import java.util.*;
class SumEven{
  public static void main(String args[]){
    double a[]=new double[5];
        double sum =0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the element to the array");
    for(int i =0; i<5; i++){
      a[i]= sc.nextDouble();
    }
for(int i =0; i<5; i++){
  if(a[i]%2==0){
    sum = sum+a[i];
  }
}
    System.out.println(sum);
  }
}