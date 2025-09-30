package abstractex;

// Abstract class
abstract class Shapes {
    double area;

    abstract void calArea(); // abstract method

    void show() {
        System.out.println("Area = " + area);
    }
}

class Square extends Shapes {
    double side;

    Square(double side) {
        this.side = side;
    }

    void calArea() {
        area = side * side;
    }
}

// Child class: Rectangle
class Rectangle extends Shapes {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void calArea() {
        area = length * breadth;
    }
}

public class Abstractclassex {
    public static void main(String[] args) {
        Shapes s1 = new Square(5);
        s1.calArea();
        s1.show();

        Shapes s2 = new Rectangle(4, 6);
        s2.calArea();
        s2.show();  // ✅ fixed hidden character
    }
}
