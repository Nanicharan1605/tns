package abstractex;

abstract class Shape {
    abstract void draw(); // abstract method
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Abstract {   // Renamed class
    public static void main(String[] args) {
        Shape s = new Circle(); // object of Circle
        s.draw();
    }
}
