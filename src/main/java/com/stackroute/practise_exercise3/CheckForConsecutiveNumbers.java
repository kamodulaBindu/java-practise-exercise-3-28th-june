package main.java.com.stackroute.practise_exercise3;

public class CheckForConsecutiveNumbers {
    //method to check if the numbers are consecutive or not
    public static String CheckConsecutive(int array[], int size) {
        boolean b = true;
       if(array.length>0) {
           String string = " ";
           for (int i = 0; i < size; i++) {
               if (array[i + 1] - array[i] == 1) {

               } else
                   b = false;
           }
           if (b) {
               for (int i = 0; i <= size; i++) {
                   string = string + array[i] + ",";
               }

               return string + " are consecutive";

           } else {
               for (int i = 0; i <= size; i++) {
                   if (i == size) {
                       string = string + array[i];
                   } else
                       string = string + array[i] + ",";
               }
               return string + " are not consecutive";

           }
       }
       else {
           return null;
       }
    }
}


