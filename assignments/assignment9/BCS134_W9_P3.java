package assignments.assignment9;

import java.util.Scanner;


public class BCS134_W9_P3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the model of the car :");
        String model_name = sc.nextLine();
        System.out.println("Enter the Maximum speed of the car : ");
        int maxspeed = sc.nextInt();

        Suzuki car1 = new Suzuki(model_name, maxspeed);
        car1.getModel();
        car1.getMaxspeed();
    }
}

abstract class Car {
    String carmodel;
    int carspeed;

    public abstract void getModel();
    public abstract void getMaxspeed();
};

class Suzuki extends Car {
    Suzuki(String model, int speed) {
        this.carmodel = model;
        this.carspeed = speed;
    }

    public void getModel() {
        System.out.println(carmodel);
    }

    public void getMaxspeed() {
        System.out.println(carspeed);
    }
}

