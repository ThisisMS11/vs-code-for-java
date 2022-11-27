package basics.oops.inheritances;

public class multiple {
    public static void main(String[] args) {
        Equilateral t1 = new Equilateral();

    }
}

class Shapeclass {
    public static void printsomething() {
        System.out.println("hello from shape class");
    }
}

class Traingle extends Shapeclass {
    public static void printsomething() {
        System.out.println("hello from Traingle class");
    }
}

class Equilateral extends Traingle {
    Equilateral() {
        printsomething();               // this will call the printsomething of Traingle class.
    }
}
