// Base class
class Employee {
    // Private fields
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Method to return employee details
    public String getDetails() {
        return "Name: " + name + ", Salary: " + salary;
    }
}

// Subclass
class Manager extends Employee {
    // Additional private field
    private String department;

    // Constructor using super()
    public Manager(String name, double salary, String department) {
        super(name, salary); // Call parent constructor
        this.department = department;
    }

    // Getter method
    public String getDepartment() {
        return department;
    }

    // Overriding getDetails()
    @Override
    public String getDetails() {
        return "Name: " + getName() +
               ", Salary: " + getSalary() +
               ", Department: " + department;
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        // Employee object
        Employee emp1 = new Employee("Alice", 50000.0);

        // Manager object stored in Employee reference (Polymorphism)
        Employee emp2 = new Manager("Bob", 80000.0, "IT");

        // Print details
        System.out.println(emp1.getDetails());
        System.out.println(emp2.getDetails());
    }
}