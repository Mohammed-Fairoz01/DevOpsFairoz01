import java.util.Scanner;
class EqualMatrix{
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
      System.out.println();
    }
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        b[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    //int sum[][]=new int[3][3];
    boolean equal = false; 
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        // int same1 = a[i][j];
        // int same2 = a[i][j];
       if(b[i][j]==a[i][j]){
          equal = true; 
         break;
         
        }
      }
          
    }
    if(equal){
         System.out.println("Both matrix are equal");
        }
        else{
          System.out.println("Not Equal");
        }
      }
  }