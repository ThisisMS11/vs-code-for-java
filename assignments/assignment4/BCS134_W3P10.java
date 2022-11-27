package assignments.assignment4;
import java.util.Scanner;
public class BCS134_W3P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of  a :- ");
        int a = sc.nextInt();
        System.out.print("Enter the value of  b :- ");
        int b = sc.nextInt();
        System.out.print("Enter the value of  c :- ");
        int c = sc.nextInt();

        if(a+b+c ==180){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        sc.close();
        
    }
};