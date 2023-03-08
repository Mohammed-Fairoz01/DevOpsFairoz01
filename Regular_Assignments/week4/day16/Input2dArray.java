import java.util.*;
class Input2dArray{
  public static void main(String args[]){
  int  a[][] = new int[3][2];
    Scanner sc = new Scanner(System.in);
    int count=0;
    for(int i=0; i<3; i++){
      for(int j=0; j<2; j++){
        a[i][j] =sc.nextInt();
      }
    }
    for(int i=0; i<3; i++){
      for(int j=0; j<2; j++){
        if(a[i][j]==2){
        //System.out.print(a[i][j]+" ");
          count++;
      }
      }
      
    }
    System.out.println(count);
  }
}