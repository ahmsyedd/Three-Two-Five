/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public class Card 
{
    //default modifier for child classes
    // possible cards
    public enum Suit { DIAMONDS,CLUBS,SPADES,HEARTS };
    public enum Value {EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE,SEVEN};
    
    //data
    private Suit suit; 
    private Value value;
    

    //constructor
    public Card()
    {
       
    }
    public Card(Suit s)
    {
        suit=s;
    }
    public Card(Suit s,Value v)
    {
        suit =s;
        value = v;
    }
    
    public Card(Card c)
    {
        suit=c.getSuit();
        value=c.getValue();
    }
    
    //suit getter setter
    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    
    //value getter setter
    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }
    
}
