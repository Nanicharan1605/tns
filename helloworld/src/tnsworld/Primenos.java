package tnsworld;

public class Primenos {
	public static void main(String[] args) {
		System.out.println("primes from 1 to 100 are: ");
		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 1; j <= 100; j++) {
				if (i % j == 0) {
					count++;
				}
			}
	if (count == 2) {
		System.out.println(i + " ");}
	}
	}
}
