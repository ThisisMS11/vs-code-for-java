import java.util.Scanner;
public class BCS134_W2P6 {

   // Divide a number by 2 using bitwise operator: Given an even integer N as input, write a program to divide N by 2 using bitwise operator.
   public static void main(String[] args) {
      System.out.print("enter a number : ");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int ans = a >> 1;
      System.out.print("after dividing we get : ");
      System.out.println(ans);
   }
}