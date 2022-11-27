package assignments.assignment4;

import java.util.Scanner;

public class BCS134_W3P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n1 :-");
        int n1 = sc.nextInt();
        System.out.print("Enter the value of n2 :- ");
        int n2 = sc.nextInt();
        System.out.print("Enter the value of n3 :-");
        int n3 = sc.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("the largest no is " + n1);
            } else if (n1 == n3) {
                System.out.println(0);
            } else {
                System.out.println("the largest no is " + n3);
            }
        }

        else if (n1 == n2) {
            if (n1 > n3) {
                System.out.println(0);
            }
            else {
                System.out.println("the largest no is " + n3 );
            }
        }

        else if (n2 > n1) {
            if (n2 > n3) {
                System.out.println("the greatest number is " + n2);
            } 
            else if (n2 == n3) {
                System.out.println(0);
            }
            else{
                System.out.println("the greatest number is "+ n3);
            }
        }
        else if (n1 == n2 && n2 == n3) {
            System.out.println(1);
        }

        sc.close();

    }
}
