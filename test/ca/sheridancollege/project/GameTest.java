/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Margin
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getWinnerName method, of class Game.
     */
    @Test
    public void testGetWinnerName() {
        System.out.println("getWinnerName");
        Game instance = null;
        String expResult = "";
        String result = instance.getWinnerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPriority method, of class Game.
     */
    @Test
    public void testGetPriority() {
        System.out.println("getPriority");
        Game instance = null;
        int expResult = 0;
        int result = instance.getPriority();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCards method, of class Game.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        Game instance = null;
        String expResult = "";
        String result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
