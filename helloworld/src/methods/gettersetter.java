package methods;

public class gettersetter {
    // Private field
    private String name;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Main method to test
    public static void main(String[] args) {
        gettersetter person = new gettersetter();

        // Use setter
        person.setName("Alice");

        // Use getter
        System.out.println("Name: " + person.getName());
    }
}
