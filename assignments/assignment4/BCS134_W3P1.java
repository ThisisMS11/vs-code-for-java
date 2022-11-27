package assignments.assignment4;

import java.util.Scanner;

public class BCS134_W3P1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n here is :- ");
        int n =sc.nextInt();

        if(n%2==0){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
        sc.close();

    }
}
