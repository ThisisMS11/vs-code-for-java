package assignment10;

import java.util.Scanner;

class BCS134_W10_P3 {

    public static void main(String args[]) {
        Bat animal = new Bat();
        animal.eat();
        animal.breathe();
        animal.flap();
    }
}

interface Animal {
    void eat();
}

interface Mammal {
    void breathe();
}

interface WingedAnimal {
    void flap();
}

class Bat implements Animal, Mammal, WingedAnimal {

    public void eat() {
        System.out.println("Bat can eat.");
    }

    public void breathe() {
        System.out.println("Bat can breathe.");
    }

    public void flap() {
        System.out.println("Bat can flap.");
    }
}
