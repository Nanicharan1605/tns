package keyword;


public class Thiskeyword {
	String carbrand;
	int model;
	Thiskeyword(String carbrand, int model){
		this.carbrand = carbrand;
		this.model = model;
	}
void display() {
	System.out.println("car brand: " + this.carbrand);
	System.out.println("model: " + this.model);
}
void show() {
	System.out.println(" this car is " + carbrand +"made in " + model);
}
public static void main(String[] args) {
	Thiskeyword car1 = new Thiskeyword("BMW X7", 2022);
	Thiskeyword car2 = new Thiskeyword("AUDI R8", 2025);
	car1.display();
	System.out.println();
	car2.display();
}
}