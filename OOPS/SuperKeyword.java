
class Animal {
    String color;

    // Animal() {
    // System.out.println("Animal constructor is called");
    // }

    void print() {
        System.out.println("This is animal");
    }
}

class Horse extends Animal {
    String legs;
    static int count;

    // Horse() {
    // System.out.println("Horse constructor is called");
    // super.color = "Brown";
    // color = "Red";
    // legs = "4";
    // }

    void print() {
        System.out.println("This is Horse");
    }
}

public class SuperKeyword {

    public static void main(String[] args) {
        // Horse horse = new Horse();
        // System.out.println(horse.color);
        // System.out.println(horse.legs);

        // Animal obj1 = new Horse();
        // obj1.print();

        // Animal obj2 = new Animal();
        // obj2.print();
    }
}