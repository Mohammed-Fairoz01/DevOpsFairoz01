//testcase 01
import java.util.*;
class testCase{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("You are designing a program for a coffee shop that needs to keep track of the inventory of coffee beans they have in stock.The program needs to allow the user to input the amount of coffee beans they have and then display the current inventory.");
    System.out.println("enter the amount of required amount of beans");
    int beans = sc.nextInt();
    System.out.println("The amount of beans required = " + beans);


////testcase 02
    System.out.println("You are developing a program for a hotel that needs to calculate the total cost of a customer's stay based on their room rate and the number of nights they will be staying.");
    System.out.println("enter the total nights");
    int night = sc.nextInt();
    System.out.println("total coast per night");
    int cost = sc.nextInt();
    int Total = cost*night;
    System.out.println("Total cost = " + Total);



////testcase 03  
     System.out.println("You are developing a program for a hotel that needs to calculate the total cost of a customer's stay based on their room rate and the number of nights they will be staying..");
    System.out.println("enter the each subject mark");  
    int sub1 = sc.nextInt();
    int sub2 = sc.nextInt();
    int sub3 = sc.nextInt();
    int avg = sub1+sub2+sub3;
    System.out.println("the avg mark is = "+ avg/3);


////testcase 04  
  System.out.println("You are developing a program for a library that needs to keep track of books borrowed by different members. The program needs to allow the user to input the book details and member details, and then display the borrowed book details along with the member details.");

  System.out.println("enter the book name"); 
    String name = sc.next();
  System.out.println("enter the book author name"); 
    String Aname = sc.next();
  System.out.println("enter the user ID");
    String ID = sc.next();
  System.out.println("Book name = " +name); 
  System.out.println("Author of the book = " +Aname); 
  System.out.println("member ID = " +ID); 

 ////testcase 05
System.out.println("You are developing a program for a restaurant that needs to calculate the total bill for a table of customers, including the cost of food, tax, and tip..");
   System.out.println("enter the food coast"); 
    int Fcost = sc.nextInt();
    double tax = Fcost*0.5;
    System.out.println("enter the tip given"); 
    int tip = sc.nextInt();
    double total = tax+Fcost+tip;
    System.out.println("Food cost = " +Fcost);
    System.out.println("tax = " +tax);
    System.out.println("Total bill = " +total);
  }
}