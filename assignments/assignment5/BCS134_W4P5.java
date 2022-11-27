package assignment5;

import java.util.Scanner;
public class BCS134_W4P5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n :-");
        int n =sc.nextInt();
        int holdn=n;
        int sum=0;
        while (n>0) {
            sum+=(n%10);
            n=(int)n/10;
        }
        int cuberoot=(int) Math.cbrt(holdn);
        
        if(cuberoot==sum){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
        sc.close();
    }
}
