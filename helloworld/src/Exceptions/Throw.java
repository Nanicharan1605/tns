package Exceptions;



public class Throw {
	public static void main (String[] args) {
		int age = 14;
		if (age<18)
		throw new ArithmeticException("Not Eligible");
		else
		{
			System.out.println("eligible");
		}
	}

}