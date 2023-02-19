import java.util.Scanner;
  class Atm{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int oPin=1234,nPin,opt;
      double withdrawAmt,balance=1000;
      System.out.println("please insert ATM card");
      System.out.println("Enter the pin: ");
      oPin=sc.nextInt();
      if (oPin==1234){
        System.out.println("1.Balance \n 2.Withdraw money \n 3.Deposit money \n 4.change pin \n 5.quit");
        System.out.println("Enter the option: ");
        opt=sc.nextInt();
        if(opt==1){
          System.out.println("Your Balance is : $"+balance);
        }
        else if(opt==2){
          System.out.println("withdraw money");
          System.out.println("Enter the amount to withdraw :");
          withdrawAmt=sc.nextDouble();
          if(withdrawAmt>balance){
            System.out.println("Insufficient balance");
          }
          else{
            balance=balance-withdrawAmt;
            System.out.println("Amount being processed");
            System.out.println("Current balance :"+balance);
            System.out.println("Romove atm");
          }
        }
        else if(opt==3){
          System.out.println("Enter amount to deposit : ");
          double deposit=sc.nextDouble();
          balance=balance+deposit;
          System.out.println("Amount has been Successfully deposited");
          System.out.println("Current balance :"+balance);
         
        }
        else if(opt==4){
          System.out.println("Enter new pin");
          nPin=sc.nextInt();
          System.out.println("Confirm new pin");
          int nPin1=sc.nextInt();
          if(nPin==nPin1){
            oPin=nPin;
          System.out.print("Pin Successfully changed");
          }
          else{
            System.out.println("New Pin is not matched with Confirm Pin");
          }
        }
        else if(opt==5){
          System.out.println("Good bye...Quit");
        }
        else{
         System.out.println("Invalid option");
        }
      }
      else{
        System.out.println("invalid Pin");
      }
    }
}