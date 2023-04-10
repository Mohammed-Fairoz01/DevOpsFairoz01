import java.util.Scanner;
class LowerTriangleDisp{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    // System.out.println("Enter no of row:");
    // int n=sc.nextInt();
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    System.out.println("Enter elements of array");
    int count=0;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        a[i][j]=sc.nextInt();
      }
    }
      System.out.println("The lower Triangle Matrix is");
    for(int i=0; i<3; i++){
      for(int j=0; j<=i; j++){
       System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}