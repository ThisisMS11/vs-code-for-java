package labexam;

import java.util.Scanner;

public class BCS134_LT1_P5 {
    public static int valuegiver(int[] arr) {
        int sum = 0;
        int dif;
        for (int i = 0; i < arr.length - 1; i++) {
            dif = arr[i + 1] - arr[i];
            if (dif < 0) {
                dif = dif * -1;
            }
            sum = sum + dif;
        }
        return sum;
    }

    public static void replacer(int[] arr, int x, int y) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                arr[i] = y;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int hold = sc.nextInt();
            arr[i] = hold;
        }
        int x, y;

        int[] answerarray = new int[q];

        for (int i = 0; i < q; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            replacer(arr, x, y);

            answerarray[i] = valuegiver(arr);

        }

        for (int i = 0; i < q; i++) {
            System.out.println(answerarray[i]);
        }

        sc.close();
    }
}
