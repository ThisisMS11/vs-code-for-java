package assignment10;

public class BCS134_W10_P2 {
    public static void main(String[] args) {
        String[] animal1 = new String[] { "Tiger", "Deer", "Camel", "Donkey" };

        Tiger tiger1 = new Tiger(animal1[0]);
        Deer deer1 = new Deer(animal1[1]);

        Camel camel1 = new Camel(animal1[2]);
        camel1.deliver();

        Donkey donkey1 = new Donkey(animal1[3]);
        donkey1.deliver();
    }
}

interface Transport {
    public void deliver();
}

abstract class Animal {
    String name;
}

class Tiger extends Animal {
    Tiger(String name) {
        this.name = name;
    }
}

class Deer extends Animal {
    Deer(String name) {
        this.name = name;
    }
}

class Camel extends Animal implements Transport {
    Camel(String name) {
        this.name = name;
    }

    public void deliver() {
        System.out.println(this.name);
    }
}

class Donkey extends Animal implements Transport {
    Donkey(String name) {
        this.name = name;
    }

    public void deliver() {
        System.out.println(this.name);
    }
}
