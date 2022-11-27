package assignment5;

import java.util.Scanner;

public class BCS134_W4P4 {
    public static void main(String[] args) {
        // 30 50 lcm=150 hcf=10.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n1 :- ");
        int n1 = sc.nextInt();
        System.out.print("Enter the value of n2 :- ");
        int n2 = sc.nextInt();

        int temp1 = n1;
        int temp2 = n2;
        int temp;

        while (temp2 != 0) {
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }

        int hcf = temp1;
        int lcm = (n1 * n2) / hcf;

        System.out.println("HCF of input numbers: " + hcf);
        System.out.println("LCM of input numbers: " + lcm);

        sc.close();
    }
}
