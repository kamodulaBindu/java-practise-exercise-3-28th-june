package test.com.stackroute.practise_exercise3;

import main.java.com.stackroute.practise_exercise3.Exceptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionsTest {
    Exceptions exceptions;
    @Before
    public void setup()
    {
        exceptions=new Exceptions();
    }
    @Test
    public void checkNullPointerException()
    {
        String result=exceptions.checkExceptions(" ");
        assertEquals("nullPointerException",result);
    }
    @Test
    public void checkIndexOutOfBoundException()
    {
        String result=exceptions.checkTheExceptions("11 ");
        assertEquals("index out of bound",result);
    }
    @Test
    public void checkNegativeArrayIndex()
    {
        String result=exceptions.checkTheExceptions("-2 ");
        assertEquals("negative array size exception",result);
    }
    @Test
    public void validInput()
    {
        String result=exceptions.checkTheExceptions("2 ");
        assertEquals("valid input",result);
    }
    @After
    public void tearDown()
    {
        exceptions=null;
    }


}