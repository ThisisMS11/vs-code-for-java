package assignment10;

import java.util.Scanner;

class BCS134_W10_P4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gen = sc.next();
        double inc = sc.nextDouble();
        Employee cust = new Employee();
        cust.setInformation(gen, inc);
        cust.showInformation();
        System.out.print(cust.calculateTax());
    }
}

interface Customer {
    void setInformation(String gen, double inc);

    void showInformation();
}

class Employee implements Customer {
    String gender;
    double income;

    public void setInformation(String gen, double inc) {
        this.gender = gen;
        this.income = inc;
    }

    public void showInformation() {
        System.out.println(gender);
        System.out.println(income);
    }

    public double calculateTax() {
        double tax = 0;
        if (income <= 190000) {
            return tax;
        }

        else if (income > 190000 && income <= 200000) {
            if (gender.equals("Male")) {
                tax = income / 10;
            }
        }

        else if (income > 500000) {
            if (gender.equals("Male")) {
                tax = income / 4;
            } else {
                tax = income / 5;
            }
        }

        else if (income > 200000 && income <= 500000) {
            if (gender.equals("Male")) {
                tax = income / 5;
            } else {
                tax = income / 10;
            }

        }
        return tax;
    }
}