//1.A user is trying to purchase an item online. If the item is in stock and they have enough funds in their account, the transaction will be processed. If the item is out of stock, they will be asked to try again later. If they do not have enough funds, they will be asked to add more money to their account.




import java.util.*;
class Online{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    System.out.println("enter how much item you want?");
    int item = sc.nextInt();
    int itemStock = 5;
    int amountPerItem=350;
    // itemStock = itemStock-item;
    int acBalance=1500;
    int totalAmount =item*amountPerItem;
    if(item>itemStock )
    {
      System.out.println("try again later");
    }
    else{
      System.out.println("please do payment = " + totalAmount);
    }
    if((totalAmount>acBalance)){
      System.out.println(" add more money to their accounyour ");
    }
    else if(item>itemStock ){
      System.out.println("");
    }
    else{
      System.out.println("payement done. sit back and relax your item will be there with you soon.....");
    }
  }
}