package lambdaexp;

@FunctionalInterface
interface Greeting{
	void sayMessage(String message);
}
public class AnnotationEx {
	public static void main(String[] args) {
		Greeting greet = (message) -> System.out.println("Hello, "+ message);
		greet.sayMessage("Charan");
	}
}