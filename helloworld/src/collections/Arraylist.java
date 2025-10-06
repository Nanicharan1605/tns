package collections;


import java.util.ArrayList;
public class Arraylist {
	public static void main(String args[]) {
		ArrayList a1= new ArrayList();
		a1.add(101);
		a1.add("Hello");
		a1.add(23.34);
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		System.out.println(a1.get(1));
		a1.add(a1);
		
		
		
		
		
	}

}