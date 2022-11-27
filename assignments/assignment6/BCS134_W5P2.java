package assignment6;

import java.util.Scanner;

public class BCS134_W5P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int j = 0;
        System.out.print("Enter the no. of elements in A : ");
        int n1 = sc.nextInt();
        int[] arr = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }
        int z = 0;
        System.out.print("Enter the no. of elements in B : ");

        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int temp = 0;

        for (int i = 0; i < n2; i++) {
            for (j = i; j < n2; j++) {
                if (arr2[j] > arr2[i]) {
                    temp = arr2[j];
                    arr2[j] = arr2[i];
                    arr2[i] = temp;
                }
            }
        }

        for (j = 0; j < n1; j++) {
            if (arr2[0] == arr[j])
                z = 1;
        }
        System.out.print("Distinct elements of Array B which are not in A are: ");
        if (z == 0)
            System.out.print(arr2[0] + ", ");

        for (int i = 1; i < n2 - 1; i++) {
            z = 0;
            if (arr[i] != arr[i + 1]) {

                for (j = 0; j < n1; j++) {
                    if (arr2[i] == arr[j])
                        z = 1;

                }
                if (z == 0)
                    System.out.print(arr2[i] + " ");
            }
        }
        sc.close();

    }
}
