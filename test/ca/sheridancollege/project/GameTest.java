/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author syedd
 */
public class GameTest {

    public GameTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAssignRankgood() {
        System.out.println("assignRank Good");
        Card c = new Card(Card.Suit.CLUBS, Card.Value.TEN);
        Game instance = new Game();
        int expResult = 10;
        int result = instance.assignRank(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testAssignRankbad() { //due to use of enum user cannot provide new value for card
        System.out.println("assignRank Bad");
        Card c = new Card(Card.Suit.CLUBS, Card.Value.NINE);
        Game instance = new Game();
        int expResult = 9;
        int result = instance.assignRank(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testAssignRankboundary() {
        System.out.println("assignRank Boundary");
        Card c = new Card(Card.Suit.CLUBS, Card.Value.ACE);
        Game instance = new Game();
        int expResult = 14;
        int result = instance.assignRank(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
    /**
     * Test of compareCards method, of class Game.
     */
    @Test
    public void testCompareCardsGood() {
        System.out.println("compareCards Good, player 1 win");
        Card p1 = new Card(Card.Suit.CLUBS, Card.Value.ACE);
        Card p2 = new Card(Card.Suit.CLUBS, Card.Value.EIGHT);
        Card p3 = new Card(Card.Suit.CLUBS, Card.Value.QUEEN);
        Game instance = new Game();
        int expResult = 0;
        int result = instance.compareCards(p1, p2, p3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compareCards method, of class Game.
     */
    @Test
    public void testCompareCardsBad() { // bad input cannot be provided so let us implement player 2 winning
        System.out.println("compareCards Bad, player 2 win");
        Card p1 = new Card(Card.Suit.CLUBS, Card.Value.KING);
        Card p2 = new Card(Card.Suit.CLUBS, Card.Value.ACE);
        Card p3 = new Card(Card.Suit.CLUBS, Card.Value.QUEEN);
        Game instance = new Game();
        int expResult = 1; // changed
        int result = instance.compareCards(p1, p2, p3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compareCards method, of class Game.
     */
    @Test
    public void testCompareCardsBoundary() {
        System.out.println("compareCards Boundary, player 3 wins");
        Card p1 = new Card(Card.Suit.CLUBS, Card.Value.NINE);
        Card p2 = new Card(Card.Suit.CLUBS, Card.Value.EIGHT);
        Card p3 = new Card(Card.Suit.CLUBS, Card.Value.QUEEN);
        Game instance = new Game();
        int expResult = 2; // changed
        int result = instance.compareCards(p1, p2, p3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    @Test
    public void testGetTrumpGood() {
        System.out.println("getTrump Good");
        Game instance = new Game();
        instance.setTrump(Card.Suit.CLUBS);
        Card.Suit expResult = Card.Suit.CLUBS;
        Card.Suit result = instance.getTrump();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetTrumpBad() {
        System.out.println("getTrump Bad");
        Game instance = new Game();
        instance.setTrump(Card.Suit.HEARTS); // change HEARTS TO ANY OTHER TO GET BAD RESULTS
        Card.Suit expResult = Card.Suit.HEARTS;
        Card.Suit result = instance.getTrump();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetTrumpBoundary() {
        System.out.println("getTrump Boundary");
        Game instance = new Game();
        Card.Suit expResult = null;
        Card.Suit result = instance.getTrump();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
