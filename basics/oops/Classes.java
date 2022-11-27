package basics.oops;

public class Classes {
    public static void main(String args[]) {
        Pen pen1 = new Pen(4, "Red", "GelMohit");

        /*
         * redefining the type and color of our pens
         * pen1.color = "blue";
         * pen1.type = "ballpoint";
         * 
         * redefining the type and color for our second pen
         * pen2.color = "pink";
         * pen2.type = "gen pen";
         * 
        */

        pen1.write();

        Mohit m1 = new Mohit();
        m1.age = 74;

        Mohit m2 = new Mohit(m1);
        System.out.println("the age of our m2 is :- " + m2.age);
    }
}

class Pen {
    int size;
    String color;
    String type;

    public void write() {
        System.out.println("Color :- " + this.color + " Type :- " + this.type + " Size:- " + this.size);
    }

    // !our user defined constructor is here
    Pen(int size, String color, String type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }
}

class Mohit {
    int age;
    // this is called a copy constructor.

    // this is our default constructor.
    Mohit() {
    };

    Mohit(Mohit ref) {
        this.age = ref.age;
    }

    /*
     * ! In java we do not need to define our destructors and it's intelligence
     * itself detects which are the objects which are not used anymore and thus
     * shuts them down by itself.
     */
}
