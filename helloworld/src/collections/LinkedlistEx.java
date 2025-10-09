package collections;
import java.util.LinkedList;
public class LinkedlistEx {
	 public static void main(String[] args) {
	        // Create a LinkedList
	        LinkedList<String> fruits = new LinkedList<String>();

	        // Add elements to the LinkedList
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Mango");
	        fruits.add("Orange");

	        // Display the LinkedList
	        System.out.println("Fruits in LinkedList: " + fruits);

	        // Add an element at the first position
	        fruits.addFirst("Grapes");

	        // Add an element at the last position
	        fruits.addLast("Pineapple");

	        // Display after adding
	        System.out.println("After adding first and last: " + fruits);

	        // Remove an element
	        fruits.remove("Banana");
	        System.out.println("After removing Banana: " + fruits);

	        // Get the first and last elements
	        System.out.println("First fruit: " + fruits.getFirst());
	        System.out.println("Last fruit: " + fruits.getLast());

	        // Iterate through LinkedList
	        System.out.println("Iterating through LinkedList:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	    }
}
