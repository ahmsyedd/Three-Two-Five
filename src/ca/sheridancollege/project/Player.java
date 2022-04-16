/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye, 2018
 */
public class Player {

    // variables
    private int playerID; //player id
    private String playerName; //player name
    private int roundScore;      //points of player
    private ArrayList<Card> playerCards; // cards of each player
    private int quota; // number of tricks player need to make
    private int totalScore; // annual score
    private Card playedCard; // card on play

    //constructor
    public Player(int playerID, String playerName) {
        this.playerName = playerName;
        this.playerID = playerID;
        roundScore = 0;

    }

    Player() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // getter setter
    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getRoundScore() {
        return roundScore;
    }

    public void setRoundScore(int roundScore) {
        this.roundScore = roundScore;
    }

    public ArrayList<Card> getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(ArrayList<Card> playerCards) {
        if (this.playerCards == null) {
            this.playerCards = playerCards;
        } else {
            this.playerCards.addAll(playerCards);
        }
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    // functionalities
    // display player cards
    public void showPlayerCards() {
        System.out.println("\n" + this.getPlayerName() + "'s cards");
        int i=0;
        for (Card card : this.getPlayerCards()) {
            System.out.println("Card "+i+": "+card.getValue() + " of " + card.getSuit());
            i++;
        }
    }

    public Card getPlayedCard() {
        return playedCard;
    }

    public void setPlayedCard(Card playedCard) {
        this.playedCard = playedCard;
    }
    

}
