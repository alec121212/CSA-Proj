import java.util.*;
public class Card{
  
  private Suit mySuit;
  private int myNumber;

  public setCard(Suit Suit, int Number){
    //personal note - we can now create obj
    mySuit = Suit;
    myNumber = Number;
  }
  public int getNumber(){
    return myNumber;
  }
  public String toString(){
    String[] ValueArr = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
//this will overide the obj and just print its value
    String numStr;
    for(int i = 0; i<13;i++){
      if(myNumber == i){
        numStr = ValueArr[i];
      }
    }//what this line does is it returns the number with the value of the suit 
    return numStr + " of " + mySuit.toString();//<-- this makes the enums translate to string
  }
}