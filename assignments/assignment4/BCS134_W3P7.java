package assignments.assignment4;

import java.util.Scanner;

public class BCS134_W3P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of  Basic_Salary :- ");
        int Basic_Salary = sc.nextInt();

        if (Basic_Salary <= 10000) {
            System.out.println("Gross salary = " + ((0.2 * Basic_Salary)+Basic_Salary + (0.8 * Basic_Salary)));
        }

        else if (Basic_Salary > 10001 && Basic_Salary <= 20000) {
            System.out.println("Gross salary = " + ((0.25 * Basic_Salary)+Basic_Salary + (0.9 * Basic_Salary)));

        } 
        else if (Basic_Salary >= 20001) {
            System.out.println("Gross salary = " + ((0.3 * Basic_Salary)+Basic_Salary + (0.95 * Basic_Salary)));
        }
        sc.close();
    }
}
