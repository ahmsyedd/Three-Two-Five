/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author dancye, 2018
 */
public class Game {

    private ArrayList<Player> players;// the players of the game
    private int trickNo, roundNo;
    private Card.Suit trump;

    // constructor
    public Game(int trickNo, int roundNo) {
        this.trickNo = 0;
        this.roundNo = 0;
    }

    Game() {
    }

    // getter setter
    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public int getTrickNo() {
        return trickNo;
    }

    public void setTrickNo(int trickNo) {
        this.trickNo = trickNo;
    }

    public int getRoundNo() {
        return roundNo;
    }

    public void setRoundNo(int roundNo) {
        this.roundNo = roundNo;
    }

    // bot logic to play card
    public Card botPlays(ArrayList<Card> playerCards, Card player1Card) {

        Card c = new Card();
        for (int i = 0; i < playerCards.size(); i++) {

            if (playerCards.get(i).getSuit().equals(player1Card.getSuit())) {
                c = playerCards.get(i);
                playerCards.remove(i);
                return c;
            }
        }
        c = playerCards.get(0);
        playerCards.remove(0);
        return c;

    }

    //assign rank
    public int assignRank(Card c) {
        int x = 0;
        if (c.getSuit().equals(this.getTrump())) {
            x += 100;
            
        }
        switch (c.getValue()) {
            case EIGHT:
                x += 8;
                break;
            case NINE:
                x += 9;
                break;
            case TEN:
                x += 10;
                break;
            case JACK:
                x += 11;
                break;
            case QUEEN:
                x += 12;
                break;
            case KING:
                x += 13;
                break;
            case ACE:
                x += 14;
                break;
            case SEVEN:
                x += 1000;
                
                break;
        }
        return x;
    }

    //compare cards
    public int compareCards(Card p1, Card p2, Card p3) {

        int rankp1 = assignRank(p1), rankp2 = assignRank(p2), rankp3 = assignRank(p3), win = 2;

        if (!p1.getSuit().equals(p2.getSuit())) {
            rankp2 -= 20;
        }
        if (!p1.getSuit().equals(p3.getSuit())) {
            rankp3 -= 20;
        }

        if (rankp1 > rankp2 && rankp1 > rankp3) {
            win = 0;
        } else if (rankp2 > rankp1 && rankp2 > rankp3) {
            win = 1;
        }

        return win;
    }

    public Card.Suit getTrump() {
        return trump;
    }

    public void setTrump(Card.Suit trump) {
        this.trump = trump;
    }
}
