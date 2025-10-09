package Interface;
class Herbivores {
    void eat() {
        System.out.println("Herbivores Animals");
    }
}

class cat extends Herbivores {
    void meow() {
        System.out.println("cats meow");
    }
}
public class singleinheritance {
	  public static void main(String[] args) {
	        cat d = new cat();
	        d.eat();  
	        d.meow();
	  }	      
}
