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
public class SuitsTest {
    
    public SuitsTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of values method, of class Suits.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Suits[] expResult = null;
        Suits[] result = Suits.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Suits.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String arg0 = "";
        Suits expResult = null;
        Suits result = Suits.valueOf(arg0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Suits.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Suits instance = null;
        String expResult = "";
        String result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
