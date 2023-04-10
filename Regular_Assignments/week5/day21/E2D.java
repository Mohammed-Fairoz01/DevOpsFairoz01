import java.util.*;
class E2D{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    char a[][]=new char[2][2];
      for(int i=0; i<a.length; i++){
      for(int j=0; j<a[i].length; j++){
        a[i][j]= sc.next().charAt(0);
         //System.out.println(a[i][j]+ " ");
      }
       
      }
    for(int i=0; i<a.length; i++){
      for(int j=0; j<a[i].length; j++){
         System.out.println(a[i][j]+ " ");
      }
       
      }
    System.out.println();
  }
}