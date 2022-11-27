package assignment5;
/*
*             *

 *           *

   *       *  

     *   *  

       *   

     *   *   

   *       *  

 *           * 

*              *
*/
import java.util.*;
public class BCS134_W4P11 {
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
          for(int j=1;j<=n;j++){
            if(i==j || i==2*n-j || j==2*n -i)System.out.print("*");
            else System.out.print(" ");
          }
          System.out.println();
        }
        sc.close();
      }
}
