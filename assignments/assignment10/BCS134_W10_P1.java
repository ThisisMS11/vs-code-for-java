package assignment10;

import java.lang.Math;
import java.util.Scanner;

public class BCS134_W10_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle :");
        int principle = sc.nextInt();

        System.out.println("Enter the year : ");
        float n = sc.nextFloat();

        Bank bank1 = new Bank(principle, n);
        System.out.println("Simple Interest : " + bank1.simpleInterest());
        System.out.println("Compound Interest : " + bank1.compInterest());

        sc.close();
    }
}

interface Interest {
    static final int rate = 25;

    public double simpleInterest();

    public double compInterest();
};

class Bank implements Interest {
    int principle;
    float year;

    Bank(int principle, float year) {
        this.principle = principle;
        this.year = year;
    }

    public double simpleInterest() {
        double SI = (this.principle * this.year * this.rate) / 100;
        return SI;
    }

    public double compInterest() {
        return principle * Math.pow((1 + rate / 100.0), year) - principle;
    }
};
