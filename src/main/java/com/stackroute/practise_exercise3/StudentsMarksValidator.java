package main.java.com.stackroute.practise_exercise3;

public class StudentsMarksValidator {
    //method to check if student marks are valid
    public static String validateMarks(int students, int[] marksOfStudents) {
        if (students > 0 && marksOfStudents.length > 0) {
            int sum = 0;
            String output = "";
            float average;
            //condition for valid student marks
            for (int i = 0; i < marksOfStudents.length; i++) {
                if (marksOfStudents[i] >= 0 && marksOfStudents[i] <= 100) {
                    output = "marks are valid";
                } else {
                    output = marksOfStudents[i] + " is invalid";
                    return output;
                }
            }
            return output;
        } else {
            return null;
        }
    }
}