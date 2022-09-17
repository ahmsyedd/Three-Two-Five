package ca.sheridancollege.project;

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
