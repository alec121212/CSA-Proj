import java.util.*;
public class Deck{
  private Card [] MyCards;
  private int numCards;
  // public Deck(){
  //   //need to create scanner here 
  //   Scanner sc = new Scanner(System.in);
  //   System.out.println("How many decks would you like to play with? ");
  //   int nd = sc.nextln();
  //   System.out.println("Would you like the deck to be shuffled? (please enter true or false) ");
  //   boolean sh = sc.nextln();
  //   setDeck(nd, sh);
  // }

  public setDeck(int numDecks, boolean shuffle){
    numCards = numDecks*52;
    MyCards = new Card[numCards];
    int CI = 0;
    for(int decks = 0; decks < numDecks; decks++){
      for(int s = 0; s < 4; s++){
        for(int c = 0; c<13; c++){
          MyCards[CI] =  new Card(Suit.values()[s]/*SO THIS RIGHT HERE TAKES THE ENUM SUIT CLASS AND LOOPS THROUGH THOSE FOUR VALUES - THIS IS HOW U DO IT WITH AN ENUM CLASS, U CAN ALSO DO THIS W ARRAYS*/, n);
          CI++;
        }
      }
    }
    if(shuffle == true){
      shuffle();
    }
    
    public void toShuffle(){ //IM GETTTING AN ERROR HERE ON REPL NOT SURE WHY (THIS IS A NOTE FOR MYSELF FFFFFFFFFFFFFFFFFFFFFFFFFFFFFGFFFFFFFFFFFFFF)
      Random shfl = new Random();
      Card temp;
      int q;
      for(int w = 0; w <numCards; w++){
        q = shfl.nextInt(numCards);
        temp = MyCards[w];
        myCards[i] = myCards[q];
        myCards[q] = temp;
      }
    }
  
  }

}

