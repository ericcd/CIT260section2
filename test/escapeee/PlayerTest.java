/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escapeee;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eric
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
     * Test of setName method, of class Player.
     */
    /*@Test
    public void testSetName() {
        System.out.println("setName");
        String theName = "";
        Player instance = new Player();
        instance.setName(theName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayPlayerName method, of class Player.
     
    @Test
    public void testDisplayPlayerName() {
        System.out.println("displayPlayerName");
        Player instance = new Player();
        instance.displayPlayerName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayScore method, of class Player.
     
    @Test
    public void testDisplayScore() {
        System.out.println("displayScore");
        Player instance = new Player();
        instance.displayScore();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class Player.
     */
    @Test
    public void testGetTime() {
        //test1
        System.out.println("getTime test 1");
        
        long startTime= 0;
        long endTime = 50;
        Player instance = new Player();
        long expResult = 50;
        long result = instance.getTime(startTime, endTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //test2
        System.out.println("getTime test 2");
        
        startTime = 0L;
        endTime = -5L;
        expResult = -1L;
        result = instance.getTime(startTime, endTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //test3
        System.out.println("getTime test 3");
        
        startTime= 0;
        endTime = 1;
        expResult = 1;
        result = instance.getTime(startTime, endTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //test4
        System.out.println("getTime test 4");
        
        startTime= 0;
        endTime = 0;
        expResult = 0;
        result = instance.getTime(startTime, endTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //test5
        System.out.println("getTime test 5");
        
        startTime= 12;
        endTime = 5;
        expResult = -1;
        result = instance.getTime(startTime, endTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}