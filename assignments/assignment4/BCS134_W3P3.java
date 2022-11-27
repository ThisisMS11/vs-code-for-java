package assignments.assignment4;

import java.util.Scanner;


public class BCS134_W3P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of age :-");
        int age=sc.nextInt();
        System.out.println("Enter the value of weight :- ");
        int weight=sc.nextInt();
        sc.close();

        if(age>=17 && weight >=110){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        sc.close();

    }
}
