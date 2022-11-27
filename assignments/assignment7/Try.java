import java.util.Scanner;

public class Try {

    public static void change(char[] name) {
        name[0] = 'o';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] name = sc.next().toCharArray();

        change(name);
        System.out.println(name);
        sc.close();
    }
}
