package assignments.assignment4;

import java.util.Scanner;

public class BCS134_W3P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character :- ");
        char c=sc.next().charAt(0);
        System.out.print("Enter the value of n1 :- ");
        int a=sc.nextInt();
        System.out.print("Enter the value of n2 :- ");
        int b=sc.nextInt();

        if(c=='+'){
            System.out.print(a + b);
        }
        else if(c=='-'){
            System.out.print(a-b);
        }
        else if(c=='*'){
            System.out.print(a*b);
        }
        else if(c=='/'){
            System.out.print(a/b);
        }
        sc.close();
    }
}
