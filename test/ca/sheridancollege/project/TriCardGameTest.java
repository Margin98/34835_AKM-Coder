/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Margin
 */
public class TriCardGameTest {
    
    public TriCardGameTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of addPlayers method, of class TriCardGame.
     */
    @Test
    public void testAddPlayers() {
        System.out.println("addPlayers");
        String name = "";
        TriCardGame instance = new TriCardGame();
        instance.addPlayers(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class TriCardGame.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        TriCardGame instance = new TriCardGame();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRandCardsList method, of class TriCardGame.
     */
    @Test
    public void testGetRandCardsList() {
        System.out.println("getRandCardsList");
        TriCardGame instance = new TriCardGame();
        List<String> expResult = null;
        List<String> result = instance.getRandCardsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class TriCardGame.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        TriCardGame instance = new TriCardGame();
        List<Game> expResult = null;
        List<Game> result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerCard method, of class TriCardGame.
     */
    @Test
    public void testSetPlayerCard() {
        System.out.println("setPlayerCard");
        TriCardGame instance = new TriCardGame();
        instance.setPlayerCard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cardValue method, of class TriCardGame.
     */
    @Test
    public void testCardValue() {
        System.out.println("cardValue");
        String cardVal = "";
        TriCardGame instance = new TriCardGame();
        int expResult = 0;
        int result = instance.cardValue(cardVal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cardIdentify method, of class TriCardGame.
     */
    @Test
    public void testCardIdentify() {
        System.out.println("cardIdentify");
        TriCardGame instance = new TriCardGame();
        instance.cardIdentify();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of priority method, of class TriCardGame.
     */
    @Test
    public void testPriority() {
        System.out.println("priority");
        int[] seq = null;
        int total = 0;
        int sum = 0;
        TriCardGame instance = new TriCardGame();
        int expResult = 0;
        int result = instance.priority(seq, total, sum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of result method, of class TriCardGame.
     */
    @Test
    public void testResult() {
        System.out.println("result");
        TriCardGame instance = new TriCardGame();
        instance.result();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of winner method, of class TriCardGame.
     */
    @Test
    public void testWinner() {
        System.out.println("winner");
        TriCardGame instance = new TriCardGame();
        instance.winner();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
