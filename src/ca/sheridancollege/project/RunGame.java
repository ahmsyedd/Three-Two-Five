/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Devansh
 */
public class RunGame {

    public static void main(String[] args) throws InterruptedException {
        // whole game will run here

        Scanner input = new Scanner(System.in);//scanner
        ArrayList<Player> playerList = new ArrayList<Player>();
        Game game = new Game(0, 0); // game object
        GroupOfCards cards = new GroupOfCards();

        // Welcome message
        Thread.sleep(1000);
        System.out.println("Welcome to the Game 325.\n\n ");
        Thread.sleep(1000);
        System.out.println("Instruction: There will be 1 player and 2 bots playing this game");

        //set players
        Thread.sleep(1000);
        System.out.printf("Enter Player Name: ");
        Player player1 = new Player(0, input.nextLine());
        Player player2 = new Player(1, "bot1");
        Player player3 = new Player(2, "bot2");

        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);

        game.setPlayers(playerList);

        // show players
        Thread.sleep(1000);
        System.out.println("\nAll Players: ");
        for (Player player : playerList) {
            Thread.sleep(1000);
            System.out.println(player.getPlayerName());
        }

        for (int j = 0; j < 3; j++) {

            //intial quotas for each player
            if (j == 0) {
                player1.setQuota(5);
                player2.setQuota(3);
                player3.setQuota(2);
            } else if (j == 1) {
                player1.setQuota(2);
                player2.setQuota(5);
                player3.setQuota(3);
            } else {
                player1.setQuota(3);
                player2.setQuota(2);
                player3.setQuota(5);
            }

            game.setRoundNo(game.getRoundNo() + 1);

            // Round 1 of game
            Thread.sleep(1000);
            System.out.println("\nInstructions: \nThe player who get 5 tricks to win selects the trump suit for the current round.");
            Thread.sleep(1000);
            System.out.println("\n---------------------------------Round " + game.getRoundNo() + " begins-----------------------\n\n" + player1.getPlayerName() + " has to win " + player1.getQuota() + " tricks");
            Thread.sleep(1000);
            System.out.println(player2.getPlayerName() + " has to win " + player2.getQuota() + " tricks");
            Thread.sleep(1000);
            System.out.println(player3.getPlayerName() + " has to win " + player3.getQuota() + " tricks");

            // distribute cards to each player
            // generate and initialize deck of cards
            cards.generateCard();
            // display deck
//        cards.displayDeck();

            // shuffle cards
            cards.shuffle();

            // distribute 5 cards to player 1 & bots
            Thread.sleep(1000);
            System.out.println("\n5 cards distributed to each player...");
            player1.setPlayerCards(cards.distributeCards());
            Thread.sleep(1000);
            player1.showPlayerCards();

            player2.setPlayerCards(cards.distributeCards());
            player3.setPlayerCards(cards.distributeCards());

            switch (j) {
                case 0:
                    // select trump suit
                    Thread.sleep(1000);
                    System.out.println("\nSelect trump suit for this round.");
                    Thread.sleep(1000);
                    System.out.printf("Enter \n0 for DIAMONDS, \n1 for CLUBS, \n2 for SPADES, \n3 for HEARTS :");
                    int xtrump = input.nextInt();
                    Card trumpC = new Card();
                    switch (xtrump) {
                        case 0:
                            trumpC.setSuit(Card.Suit.DIAMONDS);
                            break;
                        case 1:
                            trumpC.setSuit(Card.Suit.CLUBS);
                            break;
                        case 2:
                            trumpC.setSuit(Card.Suit.SPADES);
                            break;
                        case 3:
                            trumpC.setSuit(Card.Suit.HEARTS);
                            break;
                    }
                    game.setTrump(trumpC.getSuit());
                    break;
                case 1:
                    game.setTrump(Card.Suit.HEARTS);
                    break;
                default:
                    game.setTrump(Card.Suit.SPADES);
                    break;
            }

            Thread.sleep(1000);
            System.out.println("\n\n--------------------Trump suit for this round is : " + game.getTrump());

            // distribute remaining cards
            Thread.sleep(1000);
            System.out.println("\nAnother 5 cards distributed to each player...");
            player1.setPlayerCards(cards.distributeCards());

            player2.setPlayerCards(cards.distributeCards());
            player3.setPlayerCards(cards.getCards());
            cards.setCards(null);

            for (int i = 1; i <= 10; i++) {
                // trick played from here
                player1.showPlayerCards();
                game.setTrickNo(game.getTrickNo() + 1);
                Thread.sleep(1000);
                System.out.printf("\n\n----------------Trick No: " + game.getTrickNo()+"--------------------");

                //play card
          
                System.out.printf("\n\nWhich card would you like to play " + player1.getPlayerName() + "?\nEnter card no: ");
                int cardNo = input.nextInt();
                Card playedCard1 = new Card(player1.getPlayerCards().remove(cardNo));
                player1.setPlayedCard(playedCard1);
                Thread.sleep(1000);
                System.out.println("\n\nCard played: " + playedCard1.getValue() + " of " + playedCard1.getSuit());

                //bot 1 plays his card
                Thread.sleep(1000);
                Card playedCard2 = game.botPlays(player2.getPlayerCards(), playedCard1);
                System.out.println(player2.getPlayerName() + " plays: " + playedCard2.getValue() + " of " + playedCard2.getSuit());

                // bot 2 olays his card
                Thread.sleep(1000);
                Card playedCard3 = game.botPlays(player3.getPlayerCards(), playedCard1);
                System.out.println(player3.getPlayerName() + " plays: " + playedCard3.getValue() + " of " + playedCard3.getSuit());

                // logic of player winning this trick
                Thread.sleep(1000);
                int win = game.compareCards(playedCard1, playedCard2, playedCard3);
                switch (win) {
                    case 0:
                        System.out.println(player1.getPlayerName() + " wins this trick");
                        player1.setRoundScore(player1.getRoundScore() + 1);
                        break;
                    case 1:
                        System.out.println(player2.getPlayerName() + " wins this trick");
                        player2.setRoundScore(player2.getRoundScore() + 1);
                        break;
                    default:
                        System.out.println(player3.getPlayerName() + " wins this trick");
                        player3.setRoundScore(player3.getRoundScore() + 1);
                        break;
                }
//        System.out.println("-------------\n\n");
//        player1.showPlayerCards();
// round 1 ends here
            }
            System.out.println("\n\nPoints after round:"+game.getRoundNo());
            player1.setTotalScore(player1.getTotalScore()+player1.getRoundScore() - player1.getQuota());
            System.out.println("Player: " + player1.getPlayerName() + " / Round score: " + player1.getRoundScore() + " / Quotas: " + player1.getQuota() + " / Total score:" + player1.getTotalScore());

            player2.setTotalScore(player2.getTotalScore()+player2.getRoundScore() - player2.getQuota());
            System.out.println("Player: " + player2.getPlayerName() + " / Round score: " + player2.getRoundScore() + " / Quotas: " + player2.getQuota() + " / Total score:" + player2.getTotalScore());

            player3.setTotalScore(player3.getTotalScore()+player3.getRoundScore() - player3.getQuota());
            System.out.println("Player: " + player3.getPlayerName() + " / Round score: " + player3.getRoundScore() + " / Quotas: " + player3.getQuota() + " / Total score:" + player3.getTotalScore());

            game.setTrickNo(0);
            player1.setRoundScore(0);
            player2.setRoundScore(0);
            player3.setRoundScore(0);

        }//game ends here
        
        if(player1.getTotalScore()>player2.getTotalScore() && player1.getTotalScore() > player3.getTotalScore())
            System.out.println(player1.getPlayerName()+" wins this game.");
        else if(player2.getTotalScore()>player1.getTotalScore() && player2.getTotalScore() > player3.getTotalScore())
            System.out.println(player2.getPlayerName()+" wins this game.");
        else if(player3.getTotalScore() > player1.getTotalScore() && player3.getTotalScore() > player2.getTotalScore())
            System.out.println(player3.getPlayerName()+" wins this game.");
        else
            System.out.println("Its a Draw");
    }
}
