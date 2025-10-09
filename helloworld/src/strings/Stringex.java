package strings;


public class Stringex {

	public static void main(String[] args) {
		String name = "shiva";
		String roll = "d5";
		String display = name + "," + roll + ".";
		System.out.println("Concatenation:" + display);
		System.out.println("length of display:" + display.length());
		System.out.println("Upper case:" + display.toUpperCase());
		System.out.println("Lowercase:" + display.toLowerCase());
		System.out.println("Substring (first 2 chars):" + display.substring(0,2));
		String anotherName = "charan";
		System.out.println("is my name equal to another? " + name.equals(anotherName));
		System.out.println("Character at index 1 of name: " + name.charAt(1));
	}

}