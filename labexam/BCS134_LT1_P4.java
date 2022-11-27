package labexam;

import java.util.Scanner;

public class BCS134_LT1_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        // for the first line

        int tc = n1 + (n2 - 1);   //8
        int front = tc-1-n1;
        int back = tc - 1;

        for (int i = 0; i < n2; i++) {
            if (i == 0 || i == n2 - 1) {
                for (int j = 0; j < tc; j++) {
                    if (j >= front && j <= back) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                --front;
                --back;
                System.out.println();
            }

            else if (i > 0) {
                for (int j = 0; j < tc; j++) {
                    if (j == front || j == back) {
                        System.out.print("*");
                        ;
                    } else {
                        System.out.print(" ");
                    }
                }
                --front;
                --back;
                System.out.println();
            }

        }

        sc.close();
    }
}
