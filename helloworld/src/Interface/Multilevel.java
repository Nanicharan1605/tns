package Interface;
class Animal{
	void eat() {
		System.out.println("Animals can be dangerous");
	}
}
class Dog extends Animal{
	void aggression() {
		System.out.println("dogs are not really dangerous");
	}
}
class puppy extends Dog{
	void cute() {
		System.out.println("puppies are the cutest");
	}
}
public class Multilevel {
	public static void main(String[] args) {
		puppy p = new puppy();
		p.eat();
		p.aggression();
		p.cute();
		
	}

}
