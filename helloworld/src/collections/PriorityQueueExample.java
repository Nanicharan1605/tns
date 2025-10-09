package collections;
import java.util.PriorityQueue;
public class PriorityQueueExample {
	 public static void main(String[] args) {
	        // Create a PriorityQueue of integers
	        PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();

	        // Add elements to the PriorityQueue
	        numbers.add(50);
	        numbers.add(10);
	        numbers.add(30);
	        numbers.add(20);

	        // Display the PriorityQueue (order not guaranteed)
	        System.out.println("PriorityQueue elements: " + numbers);

	        // Peek (view the smallest element without removing it)
	        System.out.println("Head element (peek): " + numbers.peek());

	        // Remove elements (poll removes the smallest element first)
	        System.out.println("Removed element (poll): " + numbers.poll());
	        System.out.println("After removing one element: " + numbers);

	        // Iterate through the PriorityQueue
	        System.out.println("Iterating through PriorityQueue:");
	        for (int num : numbers) {
	            System.out.println(num);
	        }
	    }
}
