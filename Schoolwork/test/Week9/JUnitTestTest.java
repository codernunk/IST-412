/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Week9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnitTestTest
 * This class is a test class for the JUnitTest class.  
 * It has some extremely simple test cases.
 * @author Jesse
 */
public class JUnitTestTest {
    
    public JUnitTestTest() {
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
     * Test of Test1 method, of class JUnitTest.
     */
    @Test
    public void testTest1() {
        System.out.println("Test1");
        int num1 = 0;
        int num2 = 0;
        JUnitTest instance = new JUnitTest();
        int expResult = 0;
        int result = instance.Test1(num1, num2);
        assertEquals(expResult, result);
        assertEquals(25, instance.Test1(5, 5));
        //assertEquals(15, instance.Test1(4,4)); // Deliberately wrong
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of TestBoolean method, of class JUnitTest.
     */
    @Test
    public void testTestBoolean() {
        System.out.println("TestBoolean");
        int num1 = 0;
        int num2 = 0;
        JUnitTest instance = new JUnitTest();
        boolean expResult = false;
        boolean result = instance.TestBoolean(num1, num2);
        assertEquals(expResult, result);
        assertEquals(true, instance.TestBoolean(5,2));
        assertEquals(false, instance.TestBoolean(4, 5));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of FormatTime method, of class JUnitTest.
     */
    @Test
    public void testFormatTime() {
        System.out.println("FormatTime");
        JUnitTest instance = new JUnitTest();
        
        int seconds = 0;        
        String expResult = "0:0.00";
        String result = instance.FormatTime(seconds);
        assertEquals(expResult, result);
        
        seconds = 3600;        
        expResult = "1:00.00";
        result = instance.FormatTime(seconds);
        assertEquals(expResult, result);
        
        seconds = 3660;        
        expResult = "1:01.00";
        result = instance.FormatTime(seconds);
        assertEquals(expResult, result);
    }
    
}
