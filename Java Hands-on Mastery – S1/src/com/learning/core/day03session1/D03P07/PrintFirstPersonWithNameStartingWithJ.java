package com.learning.core.day03session1.D03P07;

import java.util.TreeSet;

public class PrintFirstPersonWithNameStartingWithJ {
	public static void main(String[] args) {
        // Create a TreeSet to store person details with natural sorting based on id
        TreeSet<Person> persons = new TreeSet<>();

        // Predefined information of 6 person details
        persons.add(new Person(1, "Jerry", 30, 999.0));
        persons.add(new Person(2, "Smith", 35, 2999.0));
        persons.add(new Person(3, "Рореуе", 40, 5999.0));
        persons.add(new Person(4, "Jones", 45, 6999.0));
        persons.add(new Person(5, "John", 32, 1999.0));
        persons.add(new Person(6, "Tom", 42, 3999.0));

     // Print the id, name, and salary of each person
        
        System.out.println("Person Details ");
        for (Person person : persons) {
            System.out.println((person));
        }
     
        // Print the first person whose name starts with "J"
        printFirstPersonWithNameStartingWithJ(persons);
    }

	
	
	
    // Method to print the first person whose name starts with "J"
    public static void printFirstPersonWithNameStartingWithJ(TreeSet<Person> persons) {
        System.out.println("First person whose name starts with 'J':");
        for (Person person : persons) {
            if (person.getName().startsWith("J")) {
                System.out.println(person);
                return;
            }
        }
        System.out.println("No person found whose name starts with 'J'");
    }
}
