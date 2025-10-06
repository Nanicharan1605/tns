package com.tnsif.shiva.assignment.employees;

public class Manager extends Employee {

    protected int teamSize; // specific to Manager

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary, "Manager");
        this.teamSize = teamSize;
    }

    public void showManagerDetails() {
        // Directly accessing protected salary and public role
        System.out.println("Manager Salary: " + salary +
                           ", Role: " + role +
                           ", Team Size: " + teamSize);
    }
}
