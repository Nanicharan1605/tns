package strings;

public class Strinbufferex {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("hello");

        s1.append("World");
        System.out.println("After append: " + s1);

        s1.insert(5, ",");
        System.out.println("After insert: " + s1);

        s1.replace(6, 11, "Java");
        System.out.println("After replace: " + s1);

        s1.delete(5, 6);
        System.out.println("After delete: " + s1);

        s1.reverse();
        System.out.println("After reverse: " + s1);

        s1.reverse(); // reverse back to original order

        char ch = s1.charAt(5);
        System.out.println("Character at index 5: " + ch);

        String sub = s1.substring(5, 9); // from index 5 to 8
        System.out.println("Substring (5 to 8): " + sub);
    }
}
