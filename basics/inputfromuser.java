package basics;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class inputfromuser {
    public static void main(String[] args) {
        // sc => Scanner object
        Scanner sc = new Scanner(System.in);
        /*
         * System.out.println("Enter your age : ");
         * int a = sc.nextInt(); // to take a integer input
         * float b = sc.nextFloat();
         * System.out.println(b);
         */

        /*
         * Take text as input
         * System.out.println("Enter your name : ");
         * String name = sc.next(); // --> Mohit Saini
         * System.out.println("Name : " + name); // --> Mohit
         */

        // to take entire line as input
        System.out.println("Enter your name : ");
        String namefull = sc.nextLine(); // --> Mohit Saini
        System.out.println("Name : " + namefull); // --> Mohit Saini

    }

}
