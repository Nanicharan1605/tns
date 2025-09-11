package helloworld;

public class Typecasting {
	public static void main(String[] args) {
		int a = 10;
		float b = a;
		System.out.println("implicit conversion of int to float:" + b );
		String c = "123";
		int d = Integer.parseInt(c);
		System.out.println("explicit conversion of str ti int: " + d);
	}

}
