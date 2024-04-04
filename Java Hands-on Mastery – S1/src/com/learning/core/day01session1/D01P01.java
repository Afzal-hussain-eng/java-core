package com.learning.core.day01session1;

public class D01P01 {
	 public static Book createBook(String title, double price) {
	        return new Book(title, price);
	    }

	    public static void showBook(Book book) {
	        System.out.println("Book Title: " + book.getTitle() + " and Price: " + book.getPrice() );
	
	    }
	    public static void main(String[] args) {
	        // Example usage
	        String title = "Java Programming";
	        double price = 350;

	        Book book = createBook(title, price);
	        showBook(book);
	    }

}
