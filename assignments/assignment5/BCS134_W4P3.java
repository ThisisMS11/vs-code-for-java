package assignment5;
import java.util.Scanner;

class BCS129_W4P3 {
    public static void main(String args[]) {
        int i = 65;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for lowercase and 2 for uppercase :- ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                while (i >= 65 && i <= 90) {
                    System.out.print(Integer.toHexString(i) + " ");
                    i++;
                }

            case 2:
                while (i >= 97 && i <= 122) {
                    System.out.println(Integer.toHexString(i) + " ");
                    i++;
                }
        }

        sc.close();
    }
}