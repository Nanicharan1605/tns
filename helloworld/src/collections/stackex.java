package collections;
import java.util.Stack;
public class stackex {
	public static void main(String[] args) {
        // Create a Stack
        Stack<String> stack = new Stack<String>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");
        stack.push("Orange");

        // Display the stack
        System.out.println("Stack elements: " + stack);

        // Peek - look at the top element without removing it
        System.out.println("Top element (peek): " + stack.peek());

        // Pop - remove the top element
        System.out.println("Removed element (pop): " + stack.pop());

        // Display the stack after pop
        System.out.println("Stack after pop: " + stack);

        // Check if stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Search for an element (1-based position from top)
        System.out.println("Position of 'Banana': " + stack.search("Banana"));
    }
}
