import java.util.Scanner;
   class RockPaper{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Select options Rock,Paper,Scissor:");
    String userChoice;
    String computerChoice;
    System.out.println("Enter user choice:");
    userChoice=sc.next();
    System.out.println("Enter computer choice:");
    computerChoice=sc.next();
    if(userChoice.equals("ComputerChoice")){
      System.out.println("Tie");
    }
    else if((userChoice.equals("Rock")&&
           computerChoice.equals("Paper"))||
           (userChoice.equals("Paper")&&computerChoice.equals("Scissors"))||
           (userChoice.equals("Scissors")&&computerChoice.equals("Rock"))){
      System.out.println("You win");
      }
    else if((computerChoice.equals("Rock")&&
           userChoice.equals("Paper"))||
           (computerChoice.equals("Paper")&&userChoice.equals("Scissors"))||
           (computerChoice.equals("Scissors")&&userChoice.equals("Rock"))){
      System.out.println("You win");
  }
    else{
      System.out.println("You loser");
    }
}
   }