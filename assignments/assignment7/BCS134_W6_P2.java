public class BCS134_W6_P2 {
    public static void main(String[] args) {
        MethodOverLoading object1 = new MethodOverLoading();


        // solution(int n, char ch)
        System.out.println("square = " + object1.solution(8, 's'));
        System.out.println("Cube = " + object1.solution(8, 'q'));

        System.out.println();
        // solution(int n, int m, char ch)
        System.out.println("multiply = " + object1.solution(8, 7,'p'));
        System.out.println("sum = " + object1.solution(8, 7,'s'));

        System.out.println();
        // solution(String s1, String s2)

        System.out.println("Strings are equal = " + object1.solution("Mohit","Mohit"));
        System.out.println("Strings are equal = " + object1.solution("Mohit","Saini"));


    }
}

class MethodOverLoading {
    MethodOverLoading() {
    };

    public int solution(int n, char ch) {
        if (ch == 's') {
            return n * n;
        }
        return n * n * n;
    }

    public int solution(int n, int m, char ch) {
        if (ch == 'p') {
            return n * m;
        }
        return n + m;
    }

    public boolean solution(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
