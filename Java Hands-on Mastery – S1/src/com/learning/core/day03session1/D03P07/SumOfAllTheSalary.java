package com.learning.core.day03session1.D03P07;

import java.util.TreeSet;

public class SumOfAllTheSalary {
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

    
    // Print sum of all salaries
    printSumOfSalaries(persons);
}


// Method to calculate and print the sum of all salaries
public static void printSumOfSalaries(TreeSet<Person> persons) {
    double sum = 0;
    for (Person person : persons) {
        sum += person.getSalary();
    }
    System.out.println("Sum of all salaries: " + sum);
}
}
