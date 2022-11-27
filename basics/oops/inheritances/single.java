package basics.oops.inheritances;

public class single {
    public static void main(String[] args) {
        Traingle object1 = new Traingle();
        object1.printsomething(); // this will call the printsomething method of Traingle class.
    }
}

// I do coding just because i want to earn but also because i love doing it.

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


