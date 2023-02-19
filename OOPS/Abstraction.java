public class Abstraction {

    public static void main(String[] args) {
        Mustang horse = new Mustang();

        horse.walk();
        horse.eat();
    }
}

abstract class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }

    void eat() {
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

abstract class Horse extends Animal {
    Horse() {
        System.out.println("HORSE constructor");
    }

    @Override
    void walk() {
        // TODO Auto-generated method stub
        System.out.println("Horse nacho");

    }

    void eat() {
        System.out.println("Horse Eats");
    }

}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor");

    }
}