import java.util.*;
class Permutation{
  static void separate(String str){
    Scanner sc = new Scanner(System.in);
    int h=1;
   char arr[]=str.toCharArray();
    System.out.println("");
    for(int i=0; i<=arr.length; i++){  
    h=h+i;
    for(int j=h; i<=arr.length; i++){
      System.out.println(arr[j]);
    }
  }
  }
  public static void main(String args[]){
    separate("hello");
  }
}