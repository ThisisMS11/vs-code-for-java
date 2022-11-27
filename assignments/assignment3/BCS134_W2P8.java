import java.util.Scanner;
public class BCS134_W2P8 {

   // Given two characters C1 and C2 as input, find the modulus.
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter first character : ");
      char c1 = sc.next().charAt(0);
      System.out.print("enter second character : ");
      char c2 = sc.next().charAt(0);
      int temp1 = (int) c1;
      int temp2 = (int) c2;
      int ans = temp1 % temp2;
      System.out.print("the answer is : ");
      System.out.println(ans);
      sc.close();
   }
}
