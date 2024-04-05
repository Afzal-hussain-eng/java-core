package com.learning.core.day03session1.D03P07;

import java.util.TreeSet;

public class PersonDetails {
public static void main(String[] args) {
    // Create a TreeSet to store person details with natural sorting based on id
    TreeSet<Person> persons = new TreeSet<>();

    // Predefined information of 6 person details
    persons.add(new Person(1, "Alice", 22, 1500.0));
    persons.add(new Person(2, "Bob", 30, 2500.0));
    persons.add(new Person(3, "Charlie", 28, 1800.0));
    persons.add(new Person(4, "David", 35, 3000.0));
    persons.add(new Person(5, "John", 32, 1999.0));
    persons.add(new Person(6, "Tom", 42, 3999.0));
    
    
 // Print all the Persons details
    
    System.out.println("All Persons details:");
    System.out.println("");

    for (Person person : persons) {
       {
            System.out.println(person);
        }
    }

    // Print all the Persons details whose age is greater than 25
    System.out.println("");
    System.out.println("Persons details whose age is greater than 25:");
    System.out.println("");
    for (Person person : persons) {
        if (person.getAge() > 25) {
            System.out.println(person);
        }
    }
    
 // Print the id, name, and salary of each person
    System.out.println("");
    System.out.println("Person Details with only Id Name Salary");
    System.out.println("");

    for (Person person : persons) {
        System.out.println(formatPerson(person));
    }
    
    
    // Print all names in uppercase
       printNamesInUppercase(persons);
    
       
       // Print sum of all salaries
       printSumOfSalaries(persons);
       

       // Print the first person whose name starts with "J"
       printFirstPersonWithNameStartingWithJ(persons);
}

//Method to print only Id Name Salary
public static String formatPerson(Person person) {
    return person.getId() + " " + person.getName() + " " + person.getSalary();
}

// Method to print all names of persons in uppercase
public static void printNamesInUppercase(TreeSet<Person> persons) {
    System.out.println("");
    System.out.println("Names in Uppercase:");
    System.out.println("");
    for (Person person : persons) {
        System.out.println(person.getName().toUpperCase());
    }
}


//Method to calculate and print the sum of all salaries
public static void printSumOfSalaries(TreeSet<Person> persons) {
 double sum = 0;
 for (Person person : persons) {
     sum += person.getSalary();
 }
 System.out.println("");
 System.out.println("Sum of all salaries is: " + sum);
 System.out.println("");

}
// Method to print the first person whose name starts with "J"
public static void printFirstPersonWithNameStartingWithJ(TreeSet<Person> persons) {
    System.out.println("First person whose name starts with 'J' is:");
    System.out.println("");
    for (Person person : persons) {
        if (person.getName().startsWith("J")) {
            System.out.println(person);
            return;
        }
    }
    System.out.println("No person found whose name starts with 'J'");
}
}
