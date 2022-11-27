package basics.oops.inheritances;

public class Inheritance {
    public static void main(String[] args) {
        Cls3 object1 = new Cls3(78);
        System.out.println(object1.a);
    }
}

class Cls1 {
    int a;

    Cls1() {
        System.out.println("Default Constructor of Cls1");
    }
}

class Cls2 extends Cls1 {
    Cls2() {
        System.out.println("Default constructor of Cls2");
    }

    Cls2(int number) {
        this.a = number;
    }
}

class Cls3 extends Cls2 {
    Cls3() {
        System.out.println("Default constructor of Cls3");
    };

    Cls3(int number) {
        this.a = number;
    }
}
