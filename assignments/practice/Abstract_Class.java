package practice;

// Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

// Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

public class Abstract_Class {
    public static void main(String[] args) {
        setter emp1 = new setter();
        emp1.setEmployee("Mohit Saini", 100000);
        System.out.println();
        emp1.giveEmployee();
        emp1.sleep();
    }
}

abstract class employee {
    String name;
    int salary;


    // this constructor would be called first .
    employee() {
        System.out.println("Constructor of employee class");
    }

    public abstract void setEmployee(String name, int salary);

    public abstract void giveEmployee();

    public void sleep() {
        System.out.println("zzz");
    }
}

class setter extends employee {


    setter(){
        System.out.println("Constructor of setter class");
    }
    public void setEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void giveEmployee() {
        System.out.println("Name :- " + this.name + "\nSalary :-" + this.salary);
    }
}