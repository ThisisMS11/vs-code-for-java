package assignment5;

import java.util.Scanner;

public class BCS134_W4P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number n :-");
        int n = sc.nextInt();
        while (n > 0) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
            --n;
        }
        sc.close();

    }
}
