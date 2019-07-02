package test.com.stackroute.practise_exercise3;

import main.java.com.stackroute.practise_exercise3.CheckForConsecutiveNumbers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckForConsecutiveNumbersTest {
    CheckForConsecutiveNumbers checkForConsecutiveNumbers;
    @Before
    public void setUp(){
        checkForConsecutiveNumbers=new CheckForConsecutiveNumbers();
    }
    @Test
    public void givenArrayMustCheckIfTheNumbersAreConsecutive(){
        String result=checkForConsecutiveNumbers.CheckConsecutive(new int[]{1,2,3,4},3);
        assertEquals(" 1,2,3,4, are consecutive",result);
    }
    @Test
    public void givenArrayMustReturnWhetherTheNumbersAreConsecutiveOrNot(){
        String result=checkForConsecutiveNumbers.CheckConsecutive(new int[]{1,2,3,6,8},4);
        assertEquals(" 1,2,3,6,8 are not consecutive",result);
    }
    @After
    public void tearDown(){
        checkForConsecutiveNumbers=null;
    }

}