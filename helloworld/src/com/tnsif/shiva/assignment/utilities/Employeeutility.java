package com.tnsif.shiva.assignment.utilities;

import com.tnsif.shiva.assignment.employees.*;

public class Employeeutility {

    public void printEmployeeRole(Employee emp) {
        System.out.println("Employee Role: " + emp.role); // public → accessible
        // Cannot access emp.salary directly here (protected, diff package, not subclass)
        // Cannot access emp.employeeId (default → package-private)
        // Cannot access emp.name (private)
    }

    public void printManagerInfo(Manager mgr) {
        mgr.showManagerDetails(); // allowed, accessing subclass method
    }

    public void printDeveloperInfo(Developer dev) {
        dev.showDeveloperDetails(); // allowed
    }
}
