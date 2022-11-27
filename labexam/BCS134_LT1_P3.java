package labexam;

import java.util.Scanner;

public class BCS134_LT1_P3 {
    public static int givemul(int n) {
        int mul=1;

        if (n % 2 == 0) {
            mul = 2;
        }

        int i, j;
        for (i = 3; i < n; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }

            // j is the prime number here
            if (j == i) {
                if(n%j==0){
                    mul=mul*j;
                }
            }
        }
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer=givemul(n);
        if(answer==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        sc.close();
    }
}
