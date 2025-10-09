package collections;
import java.util.TreeSet;
public class TreesetEx {
	 public static void main(String[] args) {
	        // Create a TreeSet
	        TreeSet<String> fruits = new TreeSet<String>();

	        // Add elements to the TreeSet
	        fruits.add("Mango");
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        fruits.add("Apple"); // duplicate, will be ignored

	        // Display the TreeSet
	        System.out.println("Fruits in TreeSet: " + fruits);

	        // First and last elements (alphabetical order)
	        System.out.println("First fruit: " + fruits.first());
	        System.out.println("Last fruit: " + fruits.last());

	        // Remove an element
	        fruits.remove("Banana");
	        System.out.println("After removing Banana: " + fruits);

	        // Check if an element exists
	        if (fruits.contains("Mango")) {
	            System.out.println("Mango is present in the TreeSet");
	        }

	        // Iterate through the TreeSet
	        System.out.println("Iterating through TreeSet:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	    }
}
