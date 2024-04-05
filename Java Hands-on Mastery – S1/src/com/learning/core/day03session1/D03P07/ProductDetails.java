package com.learning.core.day03session1.D03P07;

import java.util.HashSet;
import java.util.Scanner;

public class ProductDetails {

	public static void main(String[] args) {
		// Create a HashSet to store product details
        HashSet<Product> products = new HashSet<>();

        // Predefined information of 4 products
        products.add(new Product("P001", "Maruti 800"));
        products.add(new Product("P002", "Maruti Zen"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Maruti Alto"));


    
        // List all the product details
        for (Product product : products) {
            System.out.println(product.getProductId() + " " + product.getProductName());
        }
     
    }
}