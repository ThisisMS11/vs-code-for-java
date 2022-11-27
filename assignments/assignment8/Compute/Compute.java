package Compute;
import Arithmetic.*;
public class Compute  extends Arithmetic{
    Compute object1= new Compute(); 

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
}
