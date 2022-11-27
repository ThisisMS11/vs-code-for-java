package basics;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int a = sc.nextInt();
        /* 
        if (a > 18)
            System.out.println("Yes you vote be happy !");
        else
            System.out.println("No you can't vote be sad");
        */

        //  AND OPERATOR '&&'
        
        if(a>18 && a%3!=45)
            System.out.println("if statement hit");
        // out new hit is going to be somewhere in the middle of the path and we are unaware of 
        

    }
}
