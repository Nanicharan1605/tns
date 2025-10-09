package methods;

class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

// Child class overriding the method
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Parent object
        myAnimal.sound();  // Calls parent method

        Animal myDog = new Dog();  // Parent reference but child object
        myDog.sound();  // Calls overridden method in Dog
    }
}
