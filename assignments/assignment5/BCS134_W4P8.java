package assignment5;

import java.util.Scanner;

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2  
1
*/
public class BCS134_W4P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = sc.nextInt();
        int count=n-1;
        for (int i = 1; i <= n * 2 - 1; i++) {
            if(i<=n){
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.print("\n");
            }
            else if(i>n){
                
                for (int j = 1; j <=count; j++) {
                    System.out.print(j + " ");
                }
                
                System.out.print("\n");
                --count;
            }
            
        }
        sc.close();

    }
}
