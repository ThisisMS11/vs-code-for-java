package basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
         * The variable declared inside of a for loop is only restricted to the
         * respective for loop block only.
         * for (int i = 0; i <= 5; i++) {
         * System.out.println(i-9);
         * }
         */

        /*
         * //while loop
         * int a = 0;
         * while (a <= 4) {
         * System.out.print("The value of a: " + a);
         * a++;
         * }
         */

        // do while
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the value of number : ");
            number = sc.nextInt();
            if (number < 0) {
                System.out.println("The End");
                break;
            }
        } while (number >= 0);
    }
}
