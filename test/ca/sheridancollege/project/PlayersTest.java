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
public class PlayersTest {
    
    public PlayersTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of addPlayers method, of class Players.
     */
    @Test
    public void testAddPlayers() {
        System.out.println("addPlayers");
        String name = "";
        Players instance = new Players();
        instance.addPlayers(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayers method, of class Players.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        Players instance = new Players();
        List<String> expResult = null;
        List<String> result = instance.getPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
