package assignment6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BCS134_W5P6 {

    static final int no_of_chars = 256;

    static String substringlocator(String str, String pat) {

        int len1 = str.length();
        int len2 = pat.length();

        if (len1 < len2) {
            System.out.println("No such elements exist");
            return "";
        }

        int hastpat[] = new int[no_of_chars];
        int hashstr[] = new int[no_of_chars];

        for (int i = 0; i < len2; i++)
            hastpat[pat.charAt(i)]++;

        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;

        int count = 0;
        for (int j = 0; j < len1; j++) {

            hashstr[str.charAt(j)]++;

            if (hashstr[str.charAt(j)] <= hastpat[str.charAt(j)])
                count++;

            if (count == len2) {

                while (hashstr[str.charAt(start)] > hastpat[str.charAt(start)]
                        || hastpat[str.charAt(start)] == 0) {

                    if (hashstr[str.charAt(start)] > hastpat[str.charAt(start)])
                        hashstr[str.charAt(start)]--;
                    start++;
                }

                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }

        if (start_index == -1) {
            System.out.println("No such elements exist");
            return "";
        }

        return str.substring(start_index, start_index + min_len);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string1  : ");
        String s1 = reader.readLine();

        System.out.print("Enter string2 : ");
        String s2 = reader.readLine();

        System.out.print("Smallest substring is :\n " + substringlocator(s1, s2));
    }

}
