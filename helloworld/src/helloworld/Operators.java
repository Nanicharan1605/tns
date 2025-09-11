package helloworld;

public class Operators {
	public static void main(String[] args) {
		int a = 0, b = 5;
		 System.out.println("Arithmetic Operators:");
	        System.out.println("a + b = " + (a + b));
	        System.out.println("a - b = " + (a - b));
	        System.out.println("a * b = " + (a * b));
	        System.out.println("a / b = " + (a / b));
	        System.out.println("a % b = " + (a % b));
	     System.out.println("\nRelational Operators:");
	        System.out.println("a == b + " + (a == b));
	        System.out.println("a != b + " + (a != b));
	        System.out.println("a > b + " + (a > b));
	        System.out.println("a < b + " + (a < b));
	        System.out.println("a >= b + " + (a >= b));
	        System.out.println("a <= b + " + (a <= b));   
	     System.out.println("\nLogical Operators:");
	        boolean p = true, q = false;
	        System.out.println("p && q → " + (p && q));
	        System.out.println("p || q → " + (p || q));
	        System.out.println("!p → " + (!p));
	     System.out.println("\nAssignment Operators:");
	        int c = 7;
	        c += 3; // c = c + 3
	        System.out.println("c += 3 + " + c);
	        c *= 2; // c = c * 2
	        System.out.println("c *= 2 + " + c);
	     System.out.println("\nBitwise Operators:");
	        System.out.println("a & b → " + (a & b));
	        System.out.println("a | b → " + (a | b));
	        System.out.println("a ^ b → " + (a ^ b));
	        System.out.println("~a → " + (~a));
	        System.out.println("a << 1 → " + (a << 1));
	        System.out.println("a >> 1 → " + (a >> 1));
	     System.out.println("\nTernary Operator:");
	        int age = 18;
	        String result = (age >= 18) ? "Adult" : "Minor";
	        System.out.println("Age check: " + result);
	     System.out.println("\nUnary Operators:");
	        int x = 5;
	        System.out.println("x = " + x);
	        System.out.println("++x = " + (++x)); // pre-increment
	        System.out.println("x++ = " + (x++)); // post-increment
	        System.out.println("--x = " + (--x)); // pre-decrement
	        System.out.println("x-- = " + (x--)); // post-decrement
	        System.out.println("Final x = " + x);
	        System.out.println("!(true) = " + (!true));
   
	}

}
