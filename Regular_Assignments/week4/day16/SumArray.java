import java.util.Scanner;
class SumArray{
  public static void main(String args[]){
    int count=0,sum=0;
    int a[][]={{12,45,67},{34,5,7},{12,67,89}};
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        sum=a[i][j]+sum;
    //System.out.print(a[i][j]+" ");   
       // count++;
      } 
     
    }
    //System.out.println(a[2][2]);
     System.out.println(sum);
  }
}