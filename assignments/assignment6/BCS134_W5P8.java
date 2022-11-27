package assignment6;
import java.util.Scanner;

public class BCS134_W5P8 {

    static void word_remover(String str, String word) {

        String msg[] = str.split(" ");
        String new_str = "";

        for (String words : msg) {
            if (!words.equals(word)) {
                new_str += words + " ";
            }
        }
        System.out.print(new_str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the sentence : ");
        String str = sc.nextLine();
        System.out.print("enter the word to be removed : ");
        String word = sc.next();

        word_remover(str, word);

        sc.close();
    }
}
