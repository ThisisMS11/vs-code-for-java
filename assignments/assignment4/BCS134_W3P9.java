package assignments.assignment4;

import java.util.Scanner;

public class BCS134_W3P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of  x :- ");
        int x = sc.nextInt();
        System.out.print("Enter the value of   y:- ");
        int y = sc.nextInt();

        int temp1 = 0;
        int temp2 = 0;
        if (x < 0) {
            temp1 = -1;
        } else if (x > 0) {
            temp1 = 1;
        } else if (x == 0) {
            temp1 = 0;
        }

        if (y < 0) {
            temp2 = -1;
        } else if (y > 0) {
            temp2 = 1;
        } else if (y == 0) {
            temp2 = 0;
        }
        switch (temp1) {
            case 1:
                switch (temp2) {
                    case 1:
                        System.out.println(1);
                        break;
                    case -1:
                        System.out.println(4);
                        break;
                    case 0:
                        System.out.println(0);
                        break;
                }
                break;
            case -1:
                switch (temp2) {
                    case 1:
                        System.out.println(2);
                        break;
                    case -1:
                        System.out.println(3);
                        break;

                    case 0:
                        System.out.println(0);
                        break;
                }
                break;
            case 0:
                switch (temp2) {
                    default:
                        System.out.println(0);
                        break;
                }
                break;
        }

    }
}
