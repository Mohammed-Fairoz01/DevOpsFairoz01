class Swap1{
  public static void main(String args[]){
    int a = 10;
    int b = 20;
    b=a+b; a=b-a; b= b-a; 
    System.out.print("value of a is = "+a +"value of b = "+ b);
  }
}