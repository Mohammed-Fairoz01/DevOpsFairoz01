import java.util.*;
class Configuration{
  public static void main(String args[]){
  int  a[][] = new int[3][3];
    Scanner sc = new Scanner(System.in);
    int count=0;
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        a[i][j] =sc.nextInt();
      }
    }
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        if(a[i][j]<10 && a[i][j]!=20){
          if(a[i][j]>20)
          count++;
         // break;
      } 
      }
    }
    System.out.println(count);
    // if(count==0){
    //   System.out.println("yes");
    // }
    //  else{
    //       System.out.println("NO");
    //     }
  }
}