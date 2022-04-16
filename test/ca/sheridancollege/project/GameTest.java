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



    /**
     * Test of assignRank method, of class Game.
     */
    @Test
    public void testAssignRankGood() {
        System.out.println("assignRank");
        Card c = new Card();
        Game instance = new Game();
        int expResult = 0;
        int result = instance.assignRank(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of assignRank method, of class Game.
     */
    @Test
    public void testAssignRankBad() {
        System.out.println("assignRank");
        Card c = null;
        Game instance = null;
        int expResult = 0;
        int result = instance.assignRank(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of assignRank method, of class Game.
     */
    @Test
    public void testAssignRankBoundary() {
        System.out.println("assignRank");
        Card c = null;
        Game instance = null;
        int expResult = 0;
        int result = instance.assignRank(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    
    /**
     * Test of compareCards method, of class Game.
     */
    @Test
    public void testCompareCards() {
        System.out.println("compareCards");
        Card p1 = null;
        Card p2 = null;
        Card p3 = null;
        Game instance = null;
        int expResult = 0;
        int result = instance.compareCards(p1, p2, p3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
