//Temperature Converter: Create an application that takes a temperature in Celsius or Fahrenheit as input and converts it to the other unit. Use conditional statements to determine whether to convert from Celsius to Fahrenheit or vice versa.

import java.util.*;
class Temperature{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
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
    }
  }
}