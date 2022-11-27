import java.util.Scanner;

public class BCS134_W2P1 {
//    ASCII value of a character: Given a character, find the ASCII value of it.
// e.g. Some characters and their ASCII values
   public static void main(String[] args) {
      System.out.print("enter a character : ");
      Scanner sc = new Scanner(System.in);
      char chr = sc.next().charAt(0);
      int result = (int) chr;
      System.out.print("the ASCI value of the character is : ");
      System.out.println(result);
   }
}