package Exceptions;



public class Ntrycatch {

	public static void main(String[] args) {
		try {
			try {
				String n = null;
				System.out.println(n.length());
			} catch (Exception e) {
					System.out.println("we cant get output for null values");
					
				}
				
				finally {
					System.out.println("this is nested try ");
				
				}
				}catch (Exception e) {
					System.out.println("outer catch");
				}
		
		

			

	
	}
}