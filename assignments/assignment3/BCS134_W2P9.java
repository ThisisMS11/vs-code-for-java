import java.util.Scanner;
public class BCS134_W2P9 {
   // Given an integer N as input, find whether it is even or not using bitwise operator.
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter a number : ");
      int n = sc.nextInt();

      String ans = ((n & 1) == 0) ? "yes" : "no";
      String result = (ans=="yes") ? "even":"odd";
      System.out.println("the given number is is "+result + " so the answer is "+ ans);
      sc.close();
   }
}