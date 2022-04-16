/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import jdk.javadoc.internal.doclets.toolkit.util.IndexItem;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size = 30;
    

    // getter setter
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //generate cards
    public void generateCard() {
        ArrayList<Card> cards = new ArrayList<Card>();
        
        for (Card.Suit s : Card.Suit.values()) // for each loop 
        {
            for (Card.Value v : Card.Value.values()) {
                cards.add(new Card(s, v));// object of CArd  CArd c1 = new 
            }
        }
        cards.remove(7);
        cards.remove(14);
        setCards(cards);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public ArrayList<Card> distributeCards() {
        ArrayList<Card> cards = new ArrayList<Card>();
        // this method will give 5 cards to each i.e. 3 players
         for(int i=0;i<5;i++)
        {
            cards.add(this.cards.get(i));
            this.cards.remove(i);
        }
         return cards;
    }
    
    public void displayDeck()
    {
        for(Card card: this.getCards())
        {
            System.out.println(card.getValue()+" of "+card.getSuit());
        }
    }
    
   

}//end class
