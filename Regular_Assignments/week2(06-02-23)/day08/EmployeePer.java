//A company gives its employees a bonus based on their performance. If an employee's performance is rated as "Excellent", they will receive a bonus of 10% of their salary. If their performance is rated as "Good", they will receive a bonus of 5% of their salary. If their performance is rated as "Average", they will receive a bonus of 2% of their salary. If their performance is rated as "Poor", they will receive no bonus.
 

import java.util.*;
class EmployeePer{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter performance of the employee");
    double basicSalary = 50000.0;
     double bonous;
    String performance = sc.nextLine();
    if(performance.equals("Excelent")) {
        bonous = 0.10*50000;
    }
    else if(performance.equals("Good")) {
        bonous = 0.05*50000;
    } 
    else if(performance.equals("Average")){
       bonous = 0.02*5000;
    } 
   else{
     bonous = 0.0;
   }
    System.out.println(bonous);
  }
}
