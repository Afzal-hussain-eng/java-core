package com.learning.core.day01session1;

public class Book {
	
	    private String title;
	    private double price;

	    // Constructor
	    public Book(String title, double price) {
	        this.title = title;
	        this.price = price;
	    }

	    // Getter for title
	    public String getTitle() {
	        return this.title;
	    }

	    // Setter for title
	    public void setTitle(String title) {
	        this.title = title;
	    }

	    // Getter for price
	    public double getPrice() {
	        return this.price;
	    }

	    // Setter for price
	    public void setPrice(double price) {
	        this.price = price;
	    }
	}

