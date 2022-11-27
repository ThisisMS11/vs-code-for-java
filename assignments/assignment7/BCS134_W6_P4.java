import java.util.Scanner;

public class BCS134_W6_P4 {
    public static void main(String[] args) {
        String name;
        String sex;
        int age;
        Long Mobile_no;
        String Aadhar_no;
        String Address;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name of Account Holder : ");
        name = sc.nextLine();

        System.out.println("Enter the Aadhar Card number : ");
        Aadhar_no = sc.nextLine();

        System.out.println("Enter the sex : ");
        sex = sc.nextLine();

        System.out.println("Enter the Address : ");
        Address = sc.nextLine();

        System.out.println("Enter the age : ");
        age = sc.nextInt();

        System.out.println("Enter the Mobile number : ");
        Mobile_no = sc.nextLong();

        Account user = new Account();
        String Customer_id = user.open_user_Account(name, sex, age, Mobile_no, Aadhar_no, Address);
        System.out.println(Customer_id);

        // showing the user information here
        user.show_user_AccountDetails();

        System.out.println();

        // showing the price of available test packages
        user.insert_blood_checkup_cost();

        System.out.println();

        System.out.println("Enter the Package choice : ");
        char package_choice = sc.next().charAt(0);

        double packageprice = user.Blood_checkup_package(package_choice);

        System.out.println();

        System.out.println("Package Price : " + packageprice);

        double discounted_amount = user.display_Amount(package_choice);

        System.out.println("discounted price : " + discounted_amount);

        sc.close();
    }
}

class Account {

    // Defining the user parameters;
    String name;
    String sex;
    int age;
    Long Mobile_no;
    String Aadhar_no;
    String Address;
    String customer_id;

    // Information about the tests.
    int BloodGroupTest = 200;
    int LftTest = 450;
    float SugarTest = 600.50f;
    int KftTest = 800;
    float HaemoglobinTest = 240.50f;
    int CholestrolTest = 99;

    Account() {
    };

    public String open_user_Account(String name, String sex, int age, long Mobile_no, String Aadhar_no,
            String Address) {

        if (name == "") {
            System.out.println("Name can't have a null value");
            return "TryAgain";
        }
        this.name = name;

        switch (sex) {
            case "Male":
                this.sex = sex;
                break;
            case "Female":
                this.sex = sex;
                break;
            case "Others":
                this.sex = sex;
                break;

            default:
                System.out.println("Invalid sex category");
                return "TryAgain";
        }

        if (age < 1 || age > 100) {
            System.out.println("Entered Age is incorrect");
            return "TryAgain";
        }
        this.age = age;

        // (6600000000 to 9999999999)

        if (Mobile_no > 6600000000L || Mobile_no < 9999999999L) {
            this.Mobile_no = Mobile_no;
        } else {
            System.out.println("Enter a valid phone number");
            return "";
        }

        // checking for valid Aadhar_Card Number
        if (Aadhar_no.length() < 12) {
            System.out.println("Enter a valid Aadhar No.");
            return "TryAgain";
        }
        this.Aadhar_no = Aadhar_no;

        // inputing the Address
        this.Address = Address;

        String customer_id = "";
        String numstr = Mobile_no + "";

        customer_id = customer_id + String.valueOf(age);

        customer_id = customer_id + numstr.substring(numstr.length() - 3, numstr.length());

        this.customer_id = customer_id;
        return customer_id;
    };

    public void show_user_AccountDetails() {
        System.out.println("Customer Id = \t" + customer_id);
        System.out.println("Name = \t" + this.name);
        System.out.println("Mobile Number = \t" + this.Mobile_no);
        System.out.println("Address = \t" + this.Address);
    }

    public void insert_blood_checkup_cost() {
        System.out.println("BloodGroupTest= \t" + this.BloodGroupTest);
        System.out.println("LftTest = \t" + this.LftTest);

        System.out.println("SugarTest = \t" + this.SugarTest);

        System.out.println("KftTest = \t" + this.KftTest);

        System.out.println("HaemoglobinTest = \t" + this.HaemoglobinTest);

        System.out.println("CholestrolTest = \t" + this.CholestrolTest);
    }

    public double Blood_checkup_package(char s) {
        double holdprice = 0;
        switch (s) {
            case 'A':
                holdprice = holdprice + this.BloodGroupTest + this.LftTest + this.SugarTest;
                break;
            case 'B':
                holdprice = holdprice + this.LftTest + this.CholestrolTest + this.HaemoglobinTest;
                break;
            case 'C':
                holdprice = holdprice + this.BloodGroupTest + this.LftTest + this.CholestrolTest + this.HaemoglobinTest;
                break;
            case 'D':
                holdprice = holdprice + this.LftTest + this.CholestrolTest + this.HaemoglobinTest + this.KftTest;
                break;

            default:
                System.out.println("Package not available");
                break;
        }

        return holdprice;
    }

    public double display_Amount(char s) {

        double actual_amount = this.Blood_checkup_package(s);
        if (this.age > 60) {
            return (0.75 * actual_amount);
        }

        return actual_amount;
    }

}