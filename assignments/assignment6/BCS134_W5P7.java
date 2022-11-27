package assignment6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BCS134_W5P7 {

    static void Rev(char str[], int start, int end) {

        char chr_temp;

        while (start <= end) {

            chr_temp = str[start];
            str[start] = str[end];
            str[end] = chr_temp;
            start++;
            end--;
        }
    }

    static char[] RevWords(char[] s) {

        int start = 0;
        for (int end = 0; end < s.length; end++) {

            if (s[end] == ' ') {
                Rev(s, start, end);
                start = end + 1;
            }
        }

        Rev(s, start, s.length - 1);

        Rev(s, 0, s.length - 1);
        return s;
    }

    public static void main(String[] args) throws IOException {
    
        
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter anything: ");
        String s = reader.readLine();

        char[] p = RevWords(s.toCharArray());
        System.out.print(p);


    }
}