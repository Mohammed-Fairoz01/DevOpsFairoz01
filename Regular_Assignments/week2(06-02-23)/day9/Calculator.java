import java.util.*;

class Calculator {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
    double num1,num2,sum=0; 
    num1 = sc.nextDouble();
    num2 = sc.nextDouble();
    System.out.println("enter the operator");
    char opertor;
    opertor = sc.next().charAt(0);
    if(opertor == '+' ) {
        sum = num1+num2;
    }
    else if(opertor == '-' ) {
        sum = num1-num2;
    }
    else if(opertor == '*' ) {
        sum = num1*num2;
    }
    else if(opertor == '/' ) {
        sum = num1/num2;
    }
    else {
        System.out.println("invalid");
    }
   System.out.println(sum);
  }
}