package assignment5;

import java.util.Scanner;

public class BCS134_W4P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = sc.nextInt();
        int sum = 0;
        while (true) {
            while (n > 0) {
                sum += (n % 10);
                n = (int) n / 10;
            }
            if(sum==1){
                System.out.println(0);
                break;
            }
            n = sum;
            sum=0;

        }
        sc.close();

    }
}
