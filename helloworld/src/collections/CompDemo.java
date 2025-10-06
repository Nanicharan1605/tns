package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CompDemo {
    public static void main(String[] args) {
        ArrayList<Comp> li = new ArrayList<>();

        // Add Comp objects (brand, price, ram)
        li.add(new Comp("Dell", 40234, 15));
        li.add(new Comp("HP", 56767, 16));
        li.add(new Comp("Asus", 67890, 17));

        // Sort using compareTo() from Comp class (by price)
        Collections.sort(li);

        // Print each object
        for (Comp comp : li) {
            System.out.println(comp);
        }
    }
}
