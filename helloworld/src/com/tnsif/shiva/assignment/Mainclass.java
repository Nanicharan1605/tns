package com.tnsif.shiva.assignment;

import com.tnsif.shiva.assignment.employees.*;
import com.tnsif.shiva.assignment.utilities.*;

public class Mainclass {

    public static void main(String[] args) {
        Manager m1 = new Manager("Alice", 101, 80000, 5);
        Developer d1 = new Developer("Bob", 102, 60000, "Java");

        Employeeutility utils = new Employeeutility();

        // Show using Employee method
        m1.showEmployeeInfo();
        d1.showEmployeeInfo();

        // Show subclass-specific methods
        m1.showManagerDetails();
        d1.showDeveloperDetails();

        // Show via utilities class
        utils.printEmployeeRole(m1);
        utils.printManagerInfo(m1);
        utils.printDeveloperInfo(d1);
    }
}
