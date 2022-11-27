package assignments.assignment4;

import java.util.Scanner;


public class BCS134_W3P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = sc.nextInt();

        System.out.print("Enter the value of lower range :- ");
        int lower=sc.nextInt();

        System.out.print("Enter the value of upper range :- ");
        int upper=sc.nextInt();

        if(n> lower && n<upper){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }

        sc.close();
    }

}
