package assignment5;
import java.util.Scanner;
/* 
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *   
*/
public class BCS134_W4P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = sc.nextInt();
        int f=n, l=n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n*2-1; j++) {
                if(j>= f && j <=l){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            ++l;
            --f;
            System.out.println();
        }
        sc.close();
    }

}
