import javaPackages.*;
public class Mohit {
    public static void main(String[] args) {
        firstPkg obj1 = new firstPkg();
        System.out.println("sum = " + obj1.sum(45, 78));
        System.out.println("difference = " + obj1.difference(45, 78));

        SecondPkg obj2 = new SecondPkg();

        System.out.println("Multiplication :- " + obj2.multiply(78, 100));
        System.out.println("Division :- " + obj2.division(78, 10));
    }
}
