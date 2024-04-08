package com.learning.core.day03session2;

import java.util.Hashtable;
import java.util.Scanner;

public class EmployeeDetails {
    private static Hashtable<Integer, Employee> employees = new Hashtable<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Add predefined employee details
        employees.put(1001, new Employee(1001, "John", "HR", "Manager"));
        employees.put(1002, new Employee(1002, "Alice", "Finance", "Accountant"));
        employees.put(1003, new Employee(1003, "Robert", "Development", "Product Manager"));
        employees.put(1004, new Employee(1004, "Emily", "Marketing", "Marketing Executive"));
        
        
        
        // Verify whether the HashTable is empty or not
        System.out.println("Is the HashTable empty? " + employees.isEmpty());

        
        
        
        // Get employee ID from the user
        System.out.print("\nEnter employee ID: ");
        int searchId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Employee employee = searchEmployee(searchId);
        
        
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
        
        
//        // Add employee if not exists
//        addEmployeeIfNotExists(1005, "Charles", "Testing", "QA Lead");
//        
//        

        // Take employee details from the user
        System.out.println("\nEnter the details of an employee you want to add: ");
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee department: ");
        String department = scanner.nextLine();
        System.out.print("Enter employee designation: ");
        String designation = scanner.nextLine();
        
        // Add employee if not exists
        addEmployeeIfNotExists(id, name, department, designation);


     // Print all employees
        printAllEmployees();

    }

    private static Employee searchEmployee(int id) {
        return employees.get(id);
    }
    

    private static void addEmployeeIfNotExists(int id, String name, String department, String designation) {
        Employee existingEmployee = employees.get(id);
        if (existingEmployee == null) {
            employees.put(id, new Employee(id, name, department, designation));
        }
    }
    
    private static void printAllEmployees() {
    	
        System.out.println("\nUpdated employee details");
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }
}
