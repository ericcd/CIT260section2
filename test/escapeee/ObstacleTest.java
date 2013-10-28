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
public class ObstacleTest {
    
    public ObstacleTest() {
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
     * Test of displayObstacleName method, of class Obstacle.
     
    @Test
    public void testDisplayObstacleName() {
        System.out.println("displayObstacleName");
        Obstacle instance = new Obstacle();
        instance.displayObstacleName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of riddleOne method, of class Obstacle.
     */
    @Test
    public void testRiddleOne() {
        System.out.println("riddleOne");
        Obstacle instance = new Obstacle();
        String expResult = "6";
        String result = instance.riddleOne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}