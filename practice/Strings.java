package practice;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n  : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of k  : ");
        int k = sc.nextInt();

        int hold=n<<(k-1);
        int answer= n|hold;
        System.out.println(answer);
        sc.close();

    }
}
