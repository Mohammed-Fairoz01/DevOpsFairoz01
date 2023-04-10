import java.util.Scanner;
class SumConfiguaration{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    // System.out.println("Enter no of row:");
    // int n=sc.nextInt();
    int sum=0;
    int a[][]=new int[3][3];
    System.out.println("Enter elements of array");
    int count=0;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        a[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(a[i][j]<10 || a[i][j]!=20){
          sum = sum+ a[i][j];
          
        }
      }
    }
      System.out.println(sum);
  }
}