package Interface;



class A {
	public void showA() {
		System.out.println("A is the Root class");
	}
}
class B extends A {
	public void showB() {
		System.out.println(" B is Child class of A ");
	}
}

class B1 extends A {
	public void showB1() {
		System.out.println(" B1 Child class of A");
	}
}

class C extends B1 {
	public void showC() {
		System.out.println(" C is Child class of B1");
	}
}

class D extends C {
	public void showD() {
		System.out.println(" D is Child class of C");
	}
}

public class Hybrid {
	public static void main(String[] args) {
	
		System.out.println("Hybrid Example:");
		B b = new B();
		b.showA();
		b.showB();
		
		D d = new D();
		d.showB1();
		d.showC();
		d.showD();
}}
