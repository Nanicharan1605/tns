package Exceptions;



class Sample {

	public void show() throws Exception {
		String s = null;
		throw new NullPointerException("no null values");
	}
}
public class Throwsex {
	public static void main(String[] args) throws Exception{
		Sample s1 = new Sample();
		s1.show();
	}
	}