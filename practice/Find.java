package practice;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int hold = 1;
        int answerbit = n & (~(n - 1));

        int temp = answerbit & hold;
        while (temp == 0) {
            hold = hold << 1;
            temp = answerbit & hold;
            ++count;
        }

        System.out.println("The Rightmost bit is present at " + count + " position ");
        sc.close();
    }
}
