import java.util.Arrays;

public class Basicarray {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 912;
        marks[1] = 98;
        marks[2] = 100;

        // System.out.println("the length of our marks array is " + marks.length);
        // for (int i = 0; i < marks.length; i++) {
        // System.out.print(marks[i]);
        // }

        // SORTING THE ARRAY
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        // ! finding length of the array.
        System.out.print(marks.length);

        // ! initializing at run time only
        int[] lst = { 1, 2, 3, 4, 5, 6 };

        int[][] finalmarks = { { 1, 2, 7 }, { 3, 4, 7 } };
        System.out.println("our value is" + finalmarks[0][2]);


    }
}
