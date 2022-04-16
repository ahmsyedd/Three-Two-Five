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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getPlayerID method, of class Player.
     */
    @Test
    public void testGetPlayerID() {
        System.out.println("getPlayerID");
        Player instance = null;
        int expResult = 0;
        int result = instance.getPlayerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    /**
     * Test of getPlayerName method, of class Player.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of getRoundScore method, of class Player.
     */
    @Test
    public void testGetRoundScore() {
        System.out.println("getRoundScore");
        Player instance = null;
        int expResult = 0;
        int result = instance.getRoundScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerCards method, of class Player.
     */
    @Test
    public void testGetPlayerCards() {
        System.out.println("getPlayerCards");
        Player instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getPlayerCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuota method, of class Player.
     */
    @Test
    public void testGetQuota() {
        System.out.println("getQuota");
        Player instance = null;
        int expResult = 0;
        int result = instance.getQuota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalScore method, of class Player.
     */
    @Test
    public void testGetTotalScore() {
        System.out.println("getTotalScore is Good");
        final Player instance = new Player();
        int expResult = 0;
        int result = instance.getTotalScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    

    /**
     * Test of getPlayedCard method, of class Player.
     */
    @Test
    public void testGetPlayedCard() {
        System.out.println("getPlayedCard");
        Player instance = null;
        Card expResult = null;
        Card result = instance.getPlayedCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    
}
