import java.util.*;
class Main {
  public static void main(String[] args) {
System.out.println("Hello User! You will be playing standard blackjack with 3 decks. \n\n");
  Scanner sc = new Scanner(System.in);
  // System.out.println("How many decks would you like to play with: ");
  // int numd = sc.nextInt();
  // System.out.println("Would you like the deck to be shuffled? True or False: ");
  // boolean shfl = sc.nextBoolean();
  // Deck theDeck = new Deck(numd, shfl);
  Deck theDeck = new Deck(3, true);
  Player me = new Player("Alec");
  Player dealer = new Player("Dealer");

  me.addCard(theDeck.dealNextCard());    
  dealer.addCard(theDeck.dealNextCard());   
  me.addCard(theDeck.dealNextCard());    
  dealer.addCard(theDeck.dealNextCard());   

  System.out.println("Cards are delt. \n") ;
  me.printHand(true);
  dealer.printHand(false);
  System.out.println("\n\n");

  boolean meDone = false;
  boolean dealerDone = false;
  String ans;

  while(!meDone || !dealerDone){
    if(!meDone){
      System.out.println("Hit or Stay (enter H or S): ");
      ans = sc.next();
      System.out.println();

      if(ans.compareToIgnoreCase("H") == 0){
        meDone = !me.addCard(theDeck.dealNextCard());
        me.printHand(true);


      }else{
        meDone = true;
      }
    }
  

if(!dealerDone){
  if(meDone == true){
    if(dealer.getHandSum()<17){
      System.out.println("The dealer hits. \n");
      dealerDone = !dealer.addCard(theDeck.dealNextCard());
      dealer.printHand(false);
    }
  }}else {
    System.out.println("The dealer stays. \n");
    dealerDone = true;
  }
}
  System.out.println();

me.printHand(true);
dealer.printHand(true);

int mySum = me.getHandSum();
int dealerSum = dealer.getHandSum();

if (mySum > dealerSum && mySum<= 21 || dealerSum > 21){
  System.out.println("You win!");
}else if(mySum == dealerSum){
  System.out.println("The hand is a push!");
}else {
  System.out.println("The dealer wins!");
}
}
}