public class Card{
  //one of the 4 valid suits for this car
    private Suit mySuit;
    //the number of this card - A - 1...
    private int myNumber;
  
    public Card(Suit aSuit, int aNumber){
      this.mySuit = aSuit;
      this.myNumber = aNumber;
    }
    //returns number of the card
    public int getNumber(){
      return myNumber;
    }
    public String toString(){
      String[] ValueArr = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
  //this will overide the obj and just print its value
      for(int i = 0; i<13;i++){
        String numStr;
        if(myNumber == i){
          numStr = ValueArr[i];
        }
      }//what this line does is it returns the number with the value of the suit 
      return numStr + " of " + mySuit.toString();
    // public String toString(){
  
    //   String numStr = "Error";
      
    //   //SWITCH THIS INTO A FOR LOOP W AN IF ELSE CHAIN
    //   switch(this.myNumber){
    //     case 1:
    //       numStr = "Ace";
    //       break;
    //     case 2:
    //       numStr = "Two";
    //       break;
    //     case 3:
    //       numStr = "Three";
    //       break;
    //     case 4:
    //       numStr = "Four";
    //       break;
    //     case 5:
    //       numStr = "Five";
    //       break;
    //     case 6:
    //       numStr = "Six";
    //       break;
    //     case 7:
    //       numStr = "Seven";
    //       break;
    //     case 8:
    //       numStr = "Eight";
    //       break;
    //     case 9:
    //       numStr = "Nine";
    //       break;
    //     case 10:
    //       numStr = "Ten";
    //       break;
    //     case 11:
    //       numStr = "Jack";
    //       break;
    //     case 12:
    //       numStr = "Queen";
    //       break;
    //     case 13:
    //       numStr = "King";
    //       break;
    //   }
  
    //   return numStr + " of " + mySuit.toString();
    // }
  
  }
  }