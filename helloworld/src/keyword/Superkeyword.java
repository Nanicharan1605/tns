package keyword;

class Car2 {
    String model;
    static int numberOfCars = 0; // static variable (shared by all objects)

    // Constructor
    Car2(String model) {
        this.model = model;
        numberOfCars++; // Increment whenever a car is created
    }

    // Static method
    static void displayTotalCars() {
        System.out.println("Total cars created: " + numberOfCars);
    }

    // Instance method
    void displayCar() {
        System.out.println("Car model: " + model); // ✅ fixed hidden space
    }
}
