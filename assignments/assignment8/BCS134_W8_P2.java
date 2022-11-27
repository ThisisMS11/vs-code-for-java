import java.util.*;
public class BCS134_W8_P2 {
    public static class Arithmetic {
        int sum(int a, int b) {
            return (a + b);
        }

        int subtract(int a, int b) {
            return Math.abs(a - b);
        }

        long multiply(int a, int b) {
            return (a * b);
        }

        double divide(int a, int b) {
            if (b == 0) {
                return 0;
            }
            return (a / (b * 1.0));
        }
    }

    public static class compute extends Arithmetic {
        void area(int a, int b) {
            System.out.println("Area is: " + super.multiply(a, b));

        }

        void perimetre(int a, int b) {
            System.out.println("Perimetre is: " + super.multiply(2, super.sum(a, b)));

        }

        void EdgeDiff(int a, int b) {
            System.out.println("Edge difference is: " + super.subtract(a, b));

        }

        void EdgeSum(int a, int b) {
            System.out.println("Edge Sum is: " + super.sum(a, b));

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the n2 : ");
        int n2 = sc.nextInt();

        compute object1 = new compute();
        object1.area(n1, n2);
        object1.EdgeDiff(n1, n2);
        object1.EdgeSum(n1, n2);
        object1.perimetre(n1, n2);

        sc.close();
    }
}
