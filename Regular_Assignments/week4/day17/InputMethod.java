import java.util.*;
class InputMethod{
  static void InputNumber(int n, int a[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Eneter teh size of the array");
    n = sc.nextInt();
    int arr[]=new int[n];
    for(int i =0; i<n; i++){
      arr[i]= sc.nextInt();
    }
    static void display(int a[]){
      System.out.println(".....Elements..........");
      for(int i=0; i<5; i++){
        System.out.println(a[i]);
      }
    }
  }
}