package assignment6;

import java.util.Scanner;

public class BCS134_W5P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String array[] = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
        }
        for (int i = 0; i < n - 1; i++) {
            int next = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].length() < array[next].length()) {
                    next = j;
                }
            }
            String temperory = array[next];
            array[next] = array[i];
            array[i] = temperory;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + ",");
        }
        sc.close();

    }
}
