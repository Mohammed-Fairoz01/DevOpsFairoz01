import java.util.*;
class Amount{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    System.out.println("enter the amount");
    int money = sc.nextInt();
    int note = 0;
   int amount = money/2000;
    money = money-2000*amount;
    note= note+amount;
    amount = money/500;
     money = money-500*amount;
    note= note+amount;
    amount = money/200;
     money = money-200*amount;
    note= note+amount;
    amount = money/100;
     money = money-100*amount;
    note= note+amount;
    amount = money/50;
     money = money-50*amount;
    note= note+amount;
    amount = money/20;
     money = money-20*amount;
    note= note+amount;
    amount = money/10;
     money = money-10*amount;
      note= note+amount;
    System.out.println(note);
  }
}