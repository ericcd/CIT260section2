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
 * @author zachhollingshead
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
     /
    
    @Test
    public void testSetName() {
        System.out.println("setName");
        String theName = "";
        Player instance = new Player();
        instance.setName(theName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
      Test of displayPlayerName method, of class Player.
     /
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
     /
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
     /
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        long startTime = 0L;
        long endTime = 0L;
        Player instance = new Player();
        long expResult = 0L;
        long result = instance.getTime(startTime, endTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAgeInMonths method, of class Player.
     /
    @Test
    public void testGetAgeInMonths() {
        System.out.println("getAgeInMonths");
        int ageInYears = 0;
        Player instance = new Player();
        float expResult = 0.0F;
        float result = instance.getAgeInMonths(ageInYears);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWinPercent method, of class Player.
     */
    @Test
    //test 1
    public void testGetWinPercent() {
        System.out.println("getWinPercent test 1");
        float gamesStarted = 4;
        float gamesFinished = 1;
        Player instance = new Player();
        float expResult = 0.25F;
        float result = instance.getWinPercent(gamesStarted, gamesFinished);
        assertEquals(expResult, result, 0.25);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //test 2
        
        System.out.println("getWinPercent test 2");
        gamesStarted = -89;
        gamesFinished = 0;
        //Player instance = new Player();
        expResult = -1;
        result = instance.getWinPercent(gamesStarted, gamesFinished);
        assertEquals(expResult, result, -1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //test 3
        System.out.println("getWinPercent test 3");
        gamesStarted = -1;
        gamesFinished = -12;
        //Player instance = new Player();
        expResult = -1F;
        result = instance.getWinPercent(gamesStarted, gamesFinished);
        assertEquals(expResult, result, -1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //test 4
        System.out.println("getWinPercent test 4");
        gamesStarted = -1909090;
        gamesFinished = -00;
        //Player instance = new Player();
        expResult = -1F;
        result = instance.getWinPercent(gamesStarted, gamesFinished);
        assertEquals(expResult, result, -1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //test 5
        System.out.println("getWinPercent test 5");
        gamesStarted = -12;
        gamesFinished = -1;
        //Player instance = new Player();
        expResult = -1F;
        result = instance.getWinPercent(gamesStarted, gamesFinished);
        assertEquals(expResult, result, -1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    
    
    }
}