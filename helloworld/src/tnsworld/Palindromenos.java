package tnsworld;

public class Palindromenos {
    public static void main(String[] args) {
        String str = "nayan";
        String str1 = "shreyas";
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        String reversed1 = new StringBuilder(str1).reverse().toString();
        if (str1.equals(reversed1)) {
            System.out.println(str1 + " is a palindrome.");
        } else {
            System.out.println(str1 + " is not a palindrome.");
        }
    }
}
