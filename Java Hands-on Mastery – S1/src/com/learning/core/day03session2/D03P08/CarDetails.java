package com.learning.core.day03session2.D03P08;

import java.util.Map;
import java.util.TreeMap;

public class CarDetails {

	  public static void main(String[] args) {
	        // Create TreeMap to store Car objects
	        TreeMap<Car, String> cars = new TreeMap<>();

	        // Add predefined car details
	        cars.put(new Car("Bugatti", 80050.0), "");
	        cars.put(new Car("Swift", 305000.0), "");
	        cars.put(new Car("Audi", 600100.0), "");
	        cars.put(new Car("Benz", 900000.0), "");

	        // Retrieve all car details
	        System.out.println("Retrieving all car details:\n");
	        for (Car car : cars.keySet()) {
	            System.out.println(car);
	        }
	        
	        // Retrieve car prices in reverse order
	        retrievePriceInReverseOrder(cars);
	        

	        // Retrieve key-value mapping associated with the greatest and the least price
	        retrieveGreatestAndLeastPrice(cars);
	        
	        // Remove and get a key-value mapping associated with the greatest key
	        removeAndGetGreatestKey(cars);
	        
	        // Print all the remaining car details
	        
	        System.out.println("\nThe remainig car details is:\n");
	        for (Map.Entry<Car, String> entry : cars.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	        
	        
	        // Replace the value mapped by the specified key with the new value
	        double key = 80050.0;
	        cars.put(new Car("Reva", key), cars.remove(cars.keySet().stream().filter(car -> car.getPrice() == key).findFirst().get()));

	        
	     // Print updated car details
	        System.out.println("\nUpdated car details:");
	        for (Map.Entry<Car, String> entry : cars.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	        
	    }
	  

	    // Method to retrieve the price of the car in reverse order
	    public static void retrievePriceInReverseOrder(TreeMap<Car, String> cars) {
	        // Use descendingKeySet to retrieve keys (cars) in reverse order based on price
	        System.out.println("\nRetrieving car prices in reverse order:\n");
	        for (Car car : cars.descendingKeySet()) {
	            System.out.println(car);
	        }
	    }
	    
	    // Method to retrieve the key-value mapping associated with the greatest and the least price
	    public static void retrieveGreatestAndLeastPrice(TreeMap<Car, String> cars) {
	        // Get first and last entry of TreeMap to retrieve the key-value mapping associated with the greatest and the least price
	        System.out.println("\nKey-value mapping associated with the greatest and the least price:\n");
	        System.out.println(cars.lastEntry());
	        System.out.println(cars.firstEntry());
	    }
	    
	    // Method to retrieve the key-value mapping associated with the greatest key and remove it
	    public static void removeAndGetGreatestKey(TreeMap<Car, String> cars) {
	        // Get and remove the last entry of TreeMap to retrieve the key-value mapping associated with the greatest key
	        Map.Entry<Car, String> entry = cars.pollLastEntry();
	        System.out.println("Key-value mapping associated with the greatest key:");
	        System.out.println(entry.getKey() + " " + entry.getValue());
	    }

}
