import java.util.Scanner;

public class BCS134_W2P5 {
   public static void main(String[] args) {
      System.out.print("enter a number : ");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();

      int temp = (int) (Math.floor(Math.log(a) / Math.log(2))) + 1;

      int ans = ((1 << temp) - 1) ^ a;

      System.out.print("the answer of 1s complement is : ");
      sc.close();
      System.out.println(ans);
   }
}
