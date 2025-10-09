package collections;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> fruits = new LinkedHashSet<String>();

        // Add elements to the LinkedHashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");  // duplicate value, will be ignored

        // Display the LinkedHashSet
        System.out.println("Fruits in LinkedHashSet: " + fruits);

        // Check if an element exists
        if (fruits.contains("Banana")) {
            System.out.println("Banana is present in the LinkedHashSet");
        }

        // Remove an element
        fruits.remove("Mango");
        System.out.println("After removing Mango: " + fruits);

        // Iterate through the LinkedHashSet
        System.out.println("Iterating through LinkedHashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
