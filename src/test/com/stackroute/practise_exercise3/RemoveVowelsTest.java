package test.com.stackroute.practise_exercise3;

import main.java.com.stackroute.practise_exercise3.RemoveVowels;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels removeVowels;
    String[] actualresult;
    String[] expectedresult;
    @Before
    public void setUp()throws Exception {
        removeVowels = new RemoveVowels();
    }

    @Test
    public void givenStringArrayMustReturnStringsWithoutVowels()
    {
        String input[] = {"India","United States","Germany","Egypt","czechoslovakia"};
        String output[] = {"Ind","Untd Stts", "Grmny","Egypt", "czchslvk"};
        actualresult = removeVowels.removeVowels(input);
        expectedresult = output;
        assertArrayEquals(expectedresult,actualresult);
    }
    @Test
    public void givenEmptyStringMustReturnNull()
    {
        String input[] = {};
        String output[] = null;
        actualresult = removeVowels.removeVowels(input);
        expectedresult = output;
        assertArrayEquals(expectedresult,actualresult);
    }
    @After
    public void tearDown(){
        removeVowels = null;
    }




}

