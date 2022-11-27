import java.util.Scanner;

public class BCS134_W6_P1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of operation to be executed : ");
        int n = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        Stringer object1 = new Stringer();
        if (n == 1) {
            object1.checkPalindrome(str);
        } else if (n == 2) {
            System.out.println(object1.ReverseChars(str));
        } else if (n == 3) {
            object1.Check_pattern(str);
        }

        sc.close();
    }
}

class Stringer {

    public void checkPalindrome(String str) {
        int len = str.length();
        // System.out.println(String1.charAt(11));

        int i;

        for (i = 0; i < (len / 2); i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                break;
            }
        }
        if (i == len / 2) {
            System.out.println("The Given String is Palindrome");
        } else {
            System.out.println("The Given String is not Palindrome");
        }

    }

    public String ReverseChars(String exp) {

        char[] char_exp = new char[exp.length()];
        for (int i = 0; i < exp.length(); i++) {
            char_exp[i] = exp.charAt(i);
        }

        // now let's do the reversing process

        int i = 1;
        int j = exp.length() - 2;
        char hold;
        while (i < j) {
            hold = char_exp[i];
            char_exp[i] = char_exp[j];
            char_exp[j] = hold;

            i = i + 2;
            j = j - 2;

        }

        String answer = String.valueOf(char_exp);
        return answer;
    }

    public void Check_pattern(String s) {
        if(s==""){
            System.out.println("Empty String not accepted");
            return ;
        }
        if (s.length() % 2 != 0) {
            System.out.println(s + " do not follow the pattern");
            return;
        }
        int count_m = 0;
        int count_n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'm') {
                ++count_m;
            } else if (s.charAt(i) == 'n') {
                ++count_n;
            } else {
                System.out.println(s + "do not follow the pattern");
                break;
            }
        }

        if (count_m == count_n) {
            System.out.println(s + " follows the pattern");
        }

    }
}
