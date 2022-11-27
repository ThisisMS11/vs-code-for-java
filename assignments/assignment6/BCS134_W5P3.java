package assignment6;

import java.util.Scanner;

public class BCS134_W5P3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of our array :- ");
        n=sc.nextInt();

        int [] arr=new int[n];


        System.out.println("Enter the elements from here : ");
        for (int i = 0; i < n; i++) {
            int hold=sc.nextInt();
            arr[i]=hold;
        }
        int sum=0;
        int element;
        for (int i = 0; i < n; i++) {
            element= arr[i];
            int j;
            for (j = 2; j < element; j++) {
                if(element%2==0){
                    break;
                }
            }

            if(j==element){
                sum+=element;
            }
        }

        System.out.println("The sum of all the prime numbers : " + sum);
        sc.close();
    }
}
