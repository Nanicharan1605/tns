package tnsworld;

public class Armstrongno {
	public static void checkarmstrong(int num) {
       
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;        
            sum = sum + (digit * digit * digit); 
            num = num / 10;                
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");
    }
	public static void main(String[] args) {
		checkarmstrong(56);
		checkarmstrong(36);
		checkarmstrong(153);
		
	}
}
