package practice;

// Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

// Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

public class Interfaces {
    public static void main(String[] args) {
        setter emp1 = new setter();
        // emp1.setEmployee("Mohit Saini", 100000);
        // System.out.println();
        emp1.giveEmployee();

        setter2 emp2= new setter2();
        emp2.giveEmployee();
    }
}

interface employee {
    // ! we can't declare the varialbles in a interface after declaration we have to
    // declare them at the spot only.
    static final String name = "Mohit Saini";
    static final int salary = 45000;

    // !No, you cannot have a constructor within an interface in Java.
    // employee(){
    // System.out.println("hello from interface ");
    // }

    public void giveEmployee();

    // ! interfaces can't have non abstract methods within
    // public void sleep() {
    // System.out.println("zzz");
    // }
}

class setter implements employee {

    setter() {
        System.out.println("Constructor of setter class");
    }

    public void giveEmployee() {
        System.out.println("Name :- " + this.name + "\nSalary :-" + this.salary);
    }
}


// A single Abstract method can have multiple bodies using different subclasses like this.Thank You.

class setter2 implements employee {

    setter2() {
        System.out.println("Constructor of setter2 class");
    }

    public void giveEmployee() {
        System.out.println("Name =  " + this.name + "\nSalary = " + this.salary);
    }
}