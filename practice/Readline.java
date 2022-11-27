package practice;

import java.util.*;

class Readline {
    // Function for sort an array of large numbers
    // represented as strings
    static void sortLargeNumbers(String arr[]) {
        // Refer below post for understanding below expression:
        // https://www.geeksforgeeks.org/lambda-expressions-java-8/
        Arrays.sort(arr, (left, right) -> {

            /*
             * If length of left != right, then return
             * the diff of the length else use compareTo
             * function to compare values.
             */

            System.out.println("left :- "+ left + " Right :- "+ right);
            if (left.length() != right.length())
                return left.length() - right.length();
            return left.compareTo(right);
        });
    }

    // Driver code
    public static void main(String args[]) {
        String arr[] = { "5", "1237637463746732323",
                "97987", "12" };
        sortLargeNumbers(arr);
        for (String s : arr)
            System.out.print(s + " ");
    }
}
