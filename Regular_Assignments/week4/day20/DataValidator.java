import java.util.*;
public class DataValidator {
 
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
	    System.out.println(validate(a));
     if(validate(a)==true){
       System.out.println("this is valid mail");
     }
     else{
       System.out.println("Invalid email id");
     }
        }

   public static boolean validate(String text) {
    return text.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
  }
}