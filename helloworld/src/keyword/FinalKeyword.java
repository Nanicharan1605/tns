package keyword;

class Cars1 {
    final int maxSpeed = 200;

    public final void displaySpeed() {
        System.out.println("Maximum speed of this car is: " + maxSpeed + " km/h");
    }
}

// Final class (cannot be extended)
final class SportsCar extends Cars1 {
    // You can use but not override final method
    public void showCarType() {
        System.out.println("This is a Sports Car.");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.displaySpeed();
        sc.showCarType();  // ✅ removed hidden space
    }
}
