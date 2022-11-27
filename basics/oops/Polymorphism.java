package basics.oops;

import javax.management.ValueExp;

public class Polymorphism {
    public static void main(String[] args) {
        Learn object1 = new Learn();
        object1.write(45);
    }
}

/*
 * polymorphism is a way by using which we can give same names to a number of
 * methods and the method which best matches with the arguement of our user
 * input variable while calling function will be called during compile time.
*/

class Learn {
    public static void write(int a) {
        System.out.println("a :- " + a);
    }

    public static void write(int a, String name) {
        System.out.println("a :- " + a + "name " + name);
    }

    public static void write(int a, String name, boolean valuable) {
        System.out.println("a :- " + a + " name :- " + name + "valuable : - " + valuable);
    }
}