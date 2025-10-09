package lambdaexp;
import java.util.ArrayList;
public class collectionEx {
	 public static void main(String[] args) {
	        // Create a collection (ArrayList)
	        ArrayList<String> fruits = new ArrayList<>();

	        // Add elements to the collection
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Mango");
	        fruits.add("Orange");

	        // Iterate using lambda expression
	        System.out.println("Fruits in the list:");
	        fruits.forEach(fruit -> System.out.println(fruit));

	        // Another example: print fruits in uppercase using lambda
	        System.out.println("\nFruits in uppercase:");
	        fruits.forEach(fruit -> System.out.println(fruit.toUpperCase()));
	    }
}
