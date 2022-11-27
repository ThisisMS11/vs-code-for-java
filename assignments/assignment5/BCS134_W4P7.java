package assignment5;
import java.util.Scanner;

class BCS129_W4P7 {

    static int trailingzeroes(int n) {

        String bit = Integer.toBinaryString(n);
        StringBuilder bit1 = new StringBuilder();
        bit1.append(bit);
        bit1 = bit1.reverse();
        int zero = 0;

        for (int i = 0; i < 64; i++) {
            if (bit1.charAt(i) == '0')
                zero++;

            else
                break;
        }

        return zero;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int ans = trailingzeroes(n);

        System.out.println(ans);

        sc.close();
    }
}
