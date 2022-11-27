import java.util.Scanner;

public class BCS134_W2P2 {

   // Division of a number by another: Given two integers N1 and N2, divide the former by the latter and store the result in float type number R. The code to read N1 and N2 as well as to print R has already been provided.
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter first number : ");
      int a = sc.nextInt();
      System.out.print("enter second number : ");
      int b = sc.nextInt();
      float result = a / b;
      System.out.print("the result of the operation is : ");
      System.out.printf("%.2f", result);
   }
}