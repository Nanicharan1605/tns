package Interface;

class Car3 {
    String model;
    static int numberOfCars = 0; // static variable (shared by all objects)

    // Constructor
    Car3(String model) {
        this.model = model;
        numberOfCars++; // Increment whenever a car is created
    }

    // Static method
    static void displayTotalCars() {
        System.out.println("Total cars created: " + numberOfCars);
    }

    // Instance method
    void displayCar() {
        System.out.println("Car model: " + model);
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        Car3 c1 = new Car3("BMW");
        Car3 c2 = new Car3("Audi");
        Car3 c3 = new Car3("Tesla");

        c1.displayCar();
        c2.displayCar();
        c3.displayCar();

        // Call static method using class name
        Car3.displayTotalCars();
    }
}
