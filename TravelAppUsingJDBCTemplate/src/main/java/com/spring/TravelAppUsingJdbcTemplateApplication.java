package com.spring;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.domain.PassengerDetails;
import com.spring.service.PassengerService;
@SpringBootApplication
public class TravelAppUsingJdbcTemplateApplication {

	public static void main(String[] args) {
//		SpringApplication.run(TravelAppUsingJdbcTemplateApplication.class, args);
		
//		  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//	        PassengerService passengerService = context.getBean("passengerService", PassengerService.class);

	        // Create a new passenger
//	        PassengerDetails newPassenger = new PassengerDetails();
//	        newPassenger.setPassengerName("John Doe");
//	        newPassenger.setPassengerDob(new Date());
//	        newPassenger.setPassengerPhone("1234567890");
//	        newPassenger.setPassengerEmail("john.doe@gmail.com");
//	        passengerService.createPassenger(newPassenger);

	        // Retrieve a passenger
//	        PassengerDetails passenger = passengerService.getPassengerById(1);
//	        System.out.println("Passenger: " + passenger.getPassengerName());

	        // Update a passenger
//	        passenger.setPassengerPhone("0987654321");
//	        passengerService.updatePassenger(passenger);

	        // Delete a passenger
//	        passengerService.deletePassengerById(1);

	        // Get all passengers
//	        List<PassengerDetails> passengers = passengerService.getAllPassengers();
//	        System.out.println("Passenger Details");
//	        for (PassengerDetails p : passengers) {
//	        	
//	            System.out.println("Id= "+p.getPassengerId()+" Name= "+p.getPassengerName());
//	            
//	        }
	        
	        Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        // Assuming you have an application context and passengerService bean already configured
	        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	        PassengerService passengerService = context.getBean("passengerService", PassengerService.class);
	        while (!exit) {
	            System.out.println("\n--Bus Booking System--");
	            System.out.println("Press 1 for insert");
	            System.out.println("Press 2 for update");
	            System.out.println("Press 3 for retrieve");
	            System.out.println("Press 4 for delete");
	            System.out.println("Press 5 to quit");
	            System.out.print("\nMake your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    // Insert a new passenger record
	                    insertPassenger(passengerService, scanner);
	                    break;
	                case 2:
	                    // Update an existing passenger record
	                    updatePassenger(passengerService, scanner);
	                    break;
	                case 3:
	                    // Retrieve passenger details
	                    retrievePassengers(passengerService);
	                    break;
	                case 4:
	
//	                     Delete a passenger record
	                    deletePassenger(passengerService, scanner);
	                    break;
	                case 5:
	                    // Quit the application
	                    exit = true;
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }

	            if (!exit) {
	                System.out.print("\nDo you want to continue? Press 'y' for yes or 'n' for no: ");
	                String continueChoice = scanner.next();
	                if (continueChoice.equalsIgnoreCase("n")) {
	                    exit = true;
	                }
	            }
	        }

	        scanner.close();
	    }

	        
	        
	        
	        
	    
private static void insertPassenger(PassengerService passengerService, Scanner scanner) {
    // Logic to insert a new passenger record
    System.out.println("\nInsert Passenger details");
    System.out.print("Enter passenger name: ");
    String name = scanner.next();
    System.out.print("Enter date of birth (YYYY-MM-DD): ");
    String dob = scanner.next();
    System.out.print("Enter phone number: ");
    String phone = scanner.next();
    System.out.print("Enter email: ");
    String email = scanner.next();

    PassengerDetails passenger = new PassengerDetails();
    passenger.setPassengerName(name);
    passenger.setPassengerDob(LocalDate.parse(dob));
    passenger.setPassengerPhone(phone);
    passenger.setPassengerEmail(email);

    passengerService.createPassenger(passenger);
}


private static void updatePassenger(PassengerService passengerService, Scanner scanner) {
    // Logic to update an existing passenger record
    System.out.println("\nUpdate Passenger details");
    System.out.print("Enter passenger ID: ");
    int id = scanner.nextInt();

    // Fetch the existing passenger details
    PassengerDetails passenger = passengerService.getPassengerById(id);
    if (passenger == null) {
        System.out.println("Passenger ID not found.");
        return;
    }

    System.out.println("Current details: " + passenger);

    // Collect new details from the user
    System.out.print("Enter new name (or press Enter to keep current): ");
    scanner.nextLine(); // Consume the newline character
    String newName = scanner.nextLine().trim();
    if (!newName.isEmpty()) {
        passenger.setPassengerName(newName);
    }

    System.out.print("Enter new date of birth (YYYY-MM-DD) (or press Enter to keep current): ");
    String newDob = scanner.nextLine().trim();
    if (!newDob.isEmpty()) {
        passenger.setPassengerDob(LocalDate.parse(newDob));
    }

    System.out.print("Enter new phone number (or press Enter to keep current): ");
    String newPhone = scanner.nextLine().trim();
    if (!newPhone.isEmpty()) {
        passenger.setPassengerPhone(newPhone);
    }

    System.out.print("Enter new email (or press Enter to keep current): ");
    String newEmail = scanner.nextLine().trim();
    if (!newEmail.isEmpty()) {
        passenger.setPassengerEmail(newEmail);
    }

    // Update the passenger record
    passengerService.updatePassenger(passenger);
    System.out.println("Passenger record updated successfully.");
}


private static void retrievePassengers(PassengerService passengerService) {
    // Logic to retrieve and print passenger details
    System.out.println("\nRetrieve Passenger details");
    System.out.println("Fetch all records");
    System.out.println("Passenger_id   Passenger name      Date of birth   Phone number        Email");

    List<PassengerDetails> passengers = passengerService.getAllPassengers();
    for (PassengerDetails passenger : passengers) {
        System.out.printf("%-19d %-15s %-15s %-15s %s\n",
            passenger.getPassengerId(),
            passenger.getPassengerName(),
            passenger.getPassengerDob(),
            passenger.getPassengerPhone(),
            passenger.getPassengerEmail()
        );
    }
}


private static void deletePassenger(PassengerService passengerService, Scanner scanner) {
    // Logic to delete a passenger record
    System.out.println("\nDelete Passenger details");
    System.out.print("Enter passenger ID to delete: ");
    int id = scanner.nextInt();

    passengerService.deletePassengerById(id);
    System.out.println("Passenger record deleted successfully.");
}

    
	

}
