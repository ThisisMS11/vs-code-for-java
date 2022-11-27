import java.net.SocketTimeoutException;

public class BCS134_W6_P3 {
    public static void main(String[] args) {
        MethodOverLoading object1 = new MethodOverLoading();

        System.out.println(object1.calculator(2, 3, "/"));

        System.out.println(object1.calculator(4, 5, "*"));

    }
}

class MethodOverLoading {
    MethodOverLoading() {
    };

    float calculator(int n1, int n2, String code) {
        if (code == "+") {
            return n1 + n2;
        } else if (code == "-") {
            return n1 - n2;
        } else if (code == "*") {
            return n1 * n2;
        } else if (code == "/") {
            if (n2 == 0) {
                return 0;
            }
            return n1 / n2;
        }
        return 1;
    }

    int calculator(int n1, int n2, String code) {
        if (code == "+") {
            return (int) (n1 + n2);
        } else if (code == "-") {
            return (int) (n1 - n2);
        } else if (code == "*") {
            return (int) (n1 * n2);
        } else if (code == "/") {
            if (n2 == 0) {
                return 0;
            }
            return (int) (n1 / n2);
        }
        return 1;
    }
}
