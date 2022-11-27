package basics.oops2;


public class pripub {
    public static void main(String[] args) {
        Bank customer1 = new Bank();
        customer1.password = 784445;

        // customer1.name="mohitsaini"; private variable can't be accessed from outside
        Bank.displaypassword();

        Bank2 customer2 = new Bank2("laxmi vihar");
        System.out.println("our address from Bank2 object :- " + customer2.address);

    }
}

class Bank {
    public  int password;
    private static String name;
    protected String address;

    public void displaypassword() {
        System.out.print(password);
    }

    // setters and getters 
    public void setname(String name){
        this.name=name;
    }
}

class Bank2 extends Bank {
    Bank2(String address) {
        this.address = address;
    }
}