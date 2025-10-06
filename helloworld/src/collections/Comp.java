package collections;

public class Comp implements Comparable<Comp> { // implements Comparable

    private String brand;
    private int price;
    private int ram;

    // Constructor
    public Comp(String brand, int price, int ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    // toString method
    @Override
    public String toString() {
        return "Comp{brand=" + brand + ", price=" + price + ", ram=" + ram + "}";
    }

    // compareTo method to sort by price
    @Override
    public int compareTo(Comp other) {
        return Integer.compare(this.price, other.price); // simpler and cleaner
    }
}
