package main.java.com.stackroute.practise_exercise3;

public class StudentsMarksValidator {
    public static String validateMarks(int students, int[] marksOfStudents) {
        int sum = 0;
        String output="";
        float average;
        for(int i = 0;i<marksOfStudents.length;i++){
            if(marksOfStudents[i]>=0 && marksOfStudents[i]<=100){
                output = "marks are valid";
            }
            else {
                output = marksOfStudents[i]+" is invalid";
                return  output;
            }
        }
        return output;
    }
}
