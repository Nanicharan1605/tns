package collections;
import java.util.Vector;
public class VectorEx {
	public static void main(String[] args) {
        // Create a Vector
        Vector<String> fruits = new Vector<String>();

        // Add elements to the Vector
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Display the Vector
        System.out.println("Fruits in Vector: " + fruits);

        // Add element at a specific position
        fruits.add(2, "Grapes");
        System.out.println("After adding Grapes: " + fruits);

        // Get element at index 1
        System.out.println("Element at index 1: " + fruits.get(1));

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Check if an element exists
        if (fruits.contains("Mango")) {
            System.out.println("Mango is present in the Vector");
        }

        // Display size
        System.out.println("Size of Vector: " + fruits.size());

        // Iterate through the Vector
        System.out.println("Iterating through Vector:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
