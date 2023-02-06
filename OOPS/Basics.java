// package OOPS;

public class Basics {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.setColor("Red");
        System.out.println(pen1.color);
    }

}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }
}
