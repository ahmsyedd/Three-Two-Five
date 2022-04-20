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
     * Test of getRoundScore method, of class Player.
     */
    @Test
    public void testGetRoundScoreGood() {
        System.out.println("getRoundScore Good");
         
        Player instance = new Player();
        int expResult = 1;
        int result = instance.getRoundScore()+1;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        @Test
    public void testGetRoundScoreBad() {
        System.out.println("getRoundScore Bad");
         
        Player instance = new Player();
        int expResult = -1;
        int result = instance.getRoundScore()-1;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        @Test
    public void testGetRoundScoreBoundary() {
        System.out.println("getRoundScore Boundary");
         
        Player instance = new Player();
        int expResult = 0;
        int result = instance.getRoundScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getQuota method, of class Player.
     */
    @Test
    public void testGetQuotaGood() {
         
        System.out.println("getQuota Good");
        Player instance = new Player();
        instance.setQuota(5);
        int expResult = 5;
        int result = instance.getQuota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetQuotaBad() {
         
        System.out.println("getQuota Bad");
        Player instance = new Player();
        instance.setQuota(3);
        int expResult = 3;
        int result = instance.getQuota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetQuotaBoundary() {
         
        System.out.println("getQuota Boundary");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.getQuota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
}
