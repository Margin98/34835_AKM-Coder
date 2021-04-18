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
public class CardsTest {
    
    public CardsTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of values method, of class Cards.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Cards[] expResult = null;
        Cards[] result = Cards.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Cards.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String arg0 = "";
        Cards expResult = null;
        Cards result = Cards.valueOf(arg0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Cards.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Cards instance = null;
        String expResult = "";
        String result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVal method, of class Cards.
     */
    @Test
    public void testGetVal() {
        System.out.println("getVal");
        Cards instance = null;
        int expResult = 0;
        int result = instance.getVal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
