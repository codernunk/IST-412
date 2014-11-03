/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Week9;

/**
 * This is a very simple class with a few methods
 * designed to test out the JUnit feature.
 * @author Jesse
 * @date October 27, 2014
 */
public class JUnitTest {
    
    /**
     * The most simple test of all - Test the multiplication of two numbers.
     * @param num1
     * @param num2
     * @return 
     */
    public int Test1(int num1, int num2)
    {
        return num1 * num2;
        
    }
    
    /**
     * Another very simple test - Tests to see if
     * num1 is greater than num2.
     * @param num1
     * @param num2
     * @return 
     */
    public boolean TestBoolean(int num1, int num2)
    {
        if (num1 > num2)
            return true;
        else
            return false;
    }
    
    /**
     * A bit more complicated of a test -
     * formats seconds into an hh:mm.ss time string.
     * @param seconds
     * @return 
     */
    public String FormatTime(int seconds)
    {
        int hours = seconds / 3600;
        int minutes = seconds / 60 % 60;
        int remainingSeconds = seconds % 3600 % 60;
        
        String minString = minutes < 10 ? "0"+minutes : ""+minutes;
        String secString = remainingSeconds < 10 ? "0"+remainingSeconds : ""+remainingSeconds;
        
        return hours + ":" + minString + "." + secString;
    }

}
