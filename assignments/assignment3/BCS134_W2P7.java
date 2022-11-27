import java.util.Scanner;
public class BCS134_W2P7 {

//    Sum of two integers without using addition operator and loops
//    Given two integers N1 and N2 as input, find their sum without using addition ( '+' ) operator and loops.

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter first number : ");
      int n1 = sc.nextInt();
      System.out.print("enter second number : ");
      int n2 = sc.nextInt();

      int temp = -n2;
      int ans = n1 - temp;
      System.out.print("after adding we get : ");
      System.out.println(ans);

   }
}