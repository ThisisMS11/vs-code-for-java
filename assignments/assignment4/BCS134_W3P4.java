package assignments.assignment4;

import java.util.Scanner;

public class BCS134_W3P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Grades of student :- ");
        int n =sc.nextInt();

        if(n>= 90){
            System.out.println("Grade :- A");
        }
        else if(n>= 60 && n<=89){
            System.out.println("Grade :- B");
        }
        else if(n >= 30 && n<=59) {
            System.out.println("Grade :- C");
        }
        sc.close();
    }
}
