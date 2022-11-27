package practice;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of rows : ");
        n = sc.nextInt();

        int f = 0, l = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == l || j == f) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            ++f;
            --l;
            System.out.println();
        }

        System.out.println("f = " + f + " l= " + l);

        sc.close();
    }
}
