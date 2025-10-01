package Interface;


interface phone{
	void calling();
	void sms();
}
interface Samsung extends phone {
	void calling();
}
interface jio extends phone{
	void sms();
}
class S24ultra implements Samsung{
	public void calling() {
		System.out.println("Samsung mobile : Calling iphone...");
	}
	public void sms() {
		System.out.println("Samsung mobile : Sending iphone an sms");
	}
}
class Jio5 implements jio {
	public void calling() {
		System.out.println("Jio mobile : Calling Airtel...");
	}
	public void sms() {
		System.out.println("Jio mobile : Sending airtel an sms");
	}
	
}
public class Interfaceex {
	public static void main(String[] args) {
		S24ultra samsung = new S24ultra();
		samsung.calling();
		samsung.sms();
		System.out.println();
		Jio5 jio = new Jio5();
		jio.calling();
		jio.sms();
	}

}
