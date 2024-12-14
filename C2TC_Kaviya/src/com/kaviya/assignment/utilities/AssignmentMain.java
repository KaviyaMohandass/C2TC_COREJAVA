package com.kaviya.assignment.utilities;

import com.kaviya.assignment.employees.Developer;
import com.kaviya.assignment.employees.Manager;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 90000, "IT");
        Developer developer = new Developer("Bob", 102, 80000, "Java");

        // Create EmployeeUtilities instance
        EmployeeUtilities utilities = new EmployeeUtilities();

        // Print details of the employees
        System.out.println("Manager Details:");
        utilities.printEmployeeDetails(manager);

        System.out.println("\nDeveloper Details:");
        utilities.printEmployeeDetails(developer);
    }
}
