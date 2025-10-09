package collections;
import java.util.HashSet;
public class HashSetEx {
	public static void main(String [] args) {
		HashSet<String> fruits = new HashSet<String>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("apple");
		System.out.println("Fruits in HashSet: "+ fruits);
		if (fruits.contains("banana")) {
			System.out.println("Banana is present in the Hashset");
		}
		fruits.remove("orange");
		System.out.println("After removing orange:" + fruits);
		System.out.println("Iterating through Hashset");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		}
}
