// You are given a string that contains both letters and digits. Write a program to separate the letters from the digits and store them in separate arrays. How could you optimize your program to handle very large input strings efficiently?


import java.util.*;
class SeparateArray{
  static void separate(String str){
    Scanner sc = new Scanner(System.in);
   char arr[]=str.toCharArray();
    System.out.println("");
    for(int i=0; i<arr.length; i++){
      if((arr[i]>='0') && (arr[i]<='9')){
        System.out.println("Digits are : " +arr[i]);
      }else{
        System.out.println("Alphabets are : " +arr[i]);
      }
      
    }
    
  }
  public static void main(String args[]){
    separate("hello123");
  }
}