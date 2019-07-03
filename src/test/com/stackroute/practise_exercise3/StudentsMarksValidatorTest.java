package test.com.stackroute.practise_exercise3;

import main.java.com.stackroute.practise_exercise3.StartAndEndDateOfWeek;
import main.java.com.stackroute.practise_exercise3.StudentsMarksValidator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsMarksValidatorTest {
        StudentsMarksValidator studentsMarksValidator;
        String actualresult;
        String expectedresult;
        @Before
        public void setUp()throws Exception {
            studentsMarksValidator = new StudentsMarksValidator();
        }

        @Test
        public void validateStudentMarks()
        {
            int students=10;
            int[] marks = {76,90,52,12,76,34,72,20,80,40};
            actualresult = studentsMarksValidator.validateMarks(students,marks);
            expectedresult = "marks are valid";
            assertEquals(expectedresult,actualresult);
        }
        @Test
    public void validateMarks()
    {
        int students=10;
        int[] marks = {76,909,52,12,76,34,72,20,803,40};
        actualresult = studentsMarksValidator.validateMarks(students,marks);
        expectedresult = "909 is invalid";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void validateMarksOfStudents()
    {
        int students= 0 ;
        int[] marks = {};
        actualresult = studentsMarksValidator.validateMarks(students,marks);
        expectedresult = null;
        assertEquals(expectedresult,actualresult);
    }
        @After
        public void tearDown(){
            studentsMarksValidator = null;
        }




    }



