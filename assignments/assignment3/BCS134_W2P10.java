import java.util.Scanner;
public class BCS134_W2P10 {

   // Given an integer N as input, write a program to check whether Least Significant Bit (LSB) of a number is set or not. Use bitwise operator to solve the problem.
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter a number : ");
      int n = sc.nextInt();
      String ans = ((n & 1) == 0) ? "no" : "yes";
      String result = (ans == "no") ? "unset" : "set";
      System.out.println("in the given number LSB is " + result + " so the answer is " + ans);
   }
}