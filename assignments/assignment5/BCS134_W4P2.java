package assignment5;

import java.util.Scanner;

public class BCS134_W4P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char c = sc.next().charAt(0);

        int n = (int) c;
        System.out.println(n);

        if ((n >= 65 && n <= 90)) {
            int i = 65;
            while (i <= n) {
                char hold = (char) i;
                System.out.print(hold + " ");
                i++;
            }
        }
        if ((n >= 97 && n <= 122)) {
            int i = 97;
            while (i <= n) {
                char hold = (char) i;
                System.out.print(hold + " ");
                i++;
            }
        }
        sc.close();
    }
}
