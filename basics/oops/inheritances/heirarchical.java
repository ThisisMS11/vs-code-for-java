package basics.oops.inheritances;
// I do coding just because i want to earn but also because i love doing it.

public class heirarchical {
    public static void main(String[] args) {
        Circle object1 = new Circle();
    }
}

class Shapeclass {
    Shapeclass() {
        System.out.println("Shapeclass constructor");
    }

    public static void printsomething() {
        System.out.println("hello from shape class");
    }
}

class Traingle extends Shapeclass {
    public static void printsomething() {
        System.out.println("hello from Traingle class");
    }
}

class Circle extends Shapeclass {
    Circle() {
        System.out.println("Circleclass constructor");
        this.printsomething();
    }

    public static void printsomething() {
        System.out.println("Cirlce class printsomething");
    }
}