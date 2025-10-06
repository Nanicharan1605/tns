package com.tnsif.shiva.assignment.employees;

/**
 * Employee base class demonstrating access modifiers.
 */
public class Employee {

    private String name;       // Accessible only inside Employee
    int employeeId;            // default → package-private
    protected double salary;   // accessible in same package + subclasses
    public String role;        // accessible everywhere

    // Constructor
    public Employee(String name, int employeeId, double salary, String role) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.role = role;
    }

    // Instead of getter: method inside class to display private field
    public void showEmployeeInfo() {
        System.out.println("Name: " + name +
                           ", ID: " + employeeId +
                           ", Salary: " + salary +
                           ", Role: " + role);
    }
}
