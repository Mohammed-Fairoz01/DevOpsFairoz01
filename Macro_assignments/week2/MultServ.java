import java.util.*;
import java.util.Random;
class MultServ{
  public static void main(String args[]){
    System.out.println("enter the type of service required. \n 1 for calculator. \n 2 for Converter. \n 3 for Random number. \n 4 for Exit");
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n==1){
    System.out.println("Calculator");
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
    else if(n==2){
    System.out.println("Converter");
     System.out.println("Enter temperature");
    double temp,C,F;
    temp = sc.nextDouble();
    System.out.println("convert to:");
    System.out.println("If convert to celcius:C");
    System.out.println("If convert to Fahrenheit:F");
    String convert = sc.next();
    if(convert.equals("F")){
       F = (temp* 9/5) + 32;
      System.out.println(F);
    }
    else if(convert.equals("C")){
      C = (temp - 32) * 5/9;
      System.out.println(C);
       System.out.println("Enter distance");
    double distance,KM,M;
    distance = sc.nextDouble();
    System.out.println("convert to:");
    System.out.println("If convert to Kilometer:KM");
    System.out.println("If convert to Miles:M");
    String convert1 = sc.next();
    if(convert1.equals("KM")){
       KM = distance* 1.60934;
      System.out.println(KM);
    }
    else if(convert1.equals("M")){
      M = distance*0.621371;
      System.out.println(M);
    }
    }
  }
    else if(n==3){
              Random rand = new Random();
              int randomNum = rand.nextInt(99) + 1;
      System.out.println(randomNum);
    }
    else if(n==4){
      System.out.println("Thank you for using Fairoz Web Services. \n Godd byee Visit again");
    }
}}