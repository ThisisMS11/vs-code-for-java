package assignment6;

import java.util.Scanner;

public class BCS134_W5P1 {

    static void bubblesort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int hold = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = hold;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of our array :- ");
        n = sc.nextInt();

        int[] arr = new int[n];
        int hold;
        int count=0;

        System.out.print("Enter the number : ");
        for (int i = 0; i < n; i++) {
            hold = sc.nextInt();
            if(hold%2==0){
                arr[i]=0;
            }
            else{
                arr[i] = hold;
            }
            
        }
        System.out.print("The  order in which values where entered :- ");
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                ++count;
                continue;
            }
            else{
                System.out.print(arr[i] + " ");
            }
            
        }

        for (int i = 0; i < count; i++) {
            System.out.print(" " + 0);
        }

        System.out.println();

        bubblesort(arr);

        System.out.print("After sorting : ");
        for (int i = arr.length - 1; i >= 0; --i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        sc.close();
    }
}
