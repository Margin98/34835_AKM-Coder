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
public class GroupOfCardTest {
    
    public GroupOfCardTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getCollectionCards method, of class GroupOfCard.
     */
    @Test
    public void testGetCollectionCards() {
        System.out.println("getCollectionCards");
        GroupOfCard instance = new GroupOfCard();
        List<String> expResult = null;
        List<String> result = instance.getCollectionCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCollectionCards method, of class GroupOfCard.
     */
    @Test
    public void testSetCollectionCards() {
        System.out.println("setCollectionCards");
        List<String> collectionCards = null;
        GroupOfCard instance = new GroupOfCard();
        instance.setCollectionCards(collectionCards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
