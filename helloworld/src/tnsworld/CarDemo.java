package tnsworld;
class Car {
    private String color;
    private String model;
    private String company;

    // Constructor
    public Car(String color, String model, String company) {
        this.color = color;
        this.model = model;
        this.company = company;
    }

    // Show car details
    public void showDetails() {
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }

    public void moving() {
        System.out.println(model + " is moving...");
    }

    public void stopping() {
        System.out.println(model + " has stopped.");
    }

    public void drifting() {
        System.out.println(model + " is drifting!");
    }
}
public class CarDemo {
	public static void main(String[] args) {
        Car myCar = new Car("Blue", "M5 Competition", "BMW");

        myCar.showDetails();
        myCar.moving();
        myCar.drifting();
        myCar.stopping();
        
        Car mycar2 = new Car("Red","Supra MK-4","Toyota");
        mycar2.showDetails();
        mycar2.moving();
        mycar2.drifting();
        mycar2.stopping();
        
    }
}
