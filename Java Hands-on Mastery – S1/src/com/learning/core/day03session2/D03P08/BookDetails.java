package com.learning.core.day03session2.D03P08;



import java.sql.Date;
import java.util.Comparator;
import java.util.TreeSet;

public class BookDetails {
	// Main method to test the functionality
	  public static void main(String[] args) {
	        // Create TreeSet to store Book objects
	        TreeSet<Book> books = new TreeSet<>();

	        // Add predefined book details
	        books.add(new Book(1001, "Python Learning", 715.0, "Martic C. Brown", new Date(120, 1, 2)));
	        books.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", new Date(97, 4, 19)));
	        books.add(new Book(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(84, 10, 23)));
	        books.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", new Date(84, 10, 19)));
	        books.add(new Book(1005, "Net Platform", 3497.0, "Mark J. Price", new Date(84, 2, 6)));

	        // Print all Book details
	        System.out.println("All Book details:\n");
	        for (Book book : books) {
	            System.out.println(book);
	        }
	        
	        // Print book details sorted by author names in ascending order
	        System.out.println("\nBook details sorted by author names in ascending order:\n");
	        printByAuthorAscending(books);
	    }
	  
	  

	  // Method to print book details sorted by author names in ascending order
	    public static void printByAuthorAscending(TreeSet<Book> books) {
	        TreeSet<Book> sortedByAuthor = new TreeSet<>(Comparator.comparing(Book::getAuthor));
	        sortedByAuthor.addAll(books);
	        for (Book book : sortedByAuthor) {
	            System.out.println(book);
	        }
	    }
	}