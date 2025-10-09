package trace;


public class Trace2DArray {

	public static void main(String[] args) {
		int [] [] numbers = {
				{1,2,3},
				{4,5},
				{6,7,8},
				{9}
				
		};
		System.out.println("Tracing the 2D array;");
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.println("Row" + row +", col" + col + "=" + numbers[row][col]);
			}
		}

	}
}