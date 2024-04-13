package com.spring;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfi;
import com.spring.domain.PassengerDetails;
import com.spring.service.PassengerService;

@SpringBootApplication
public class TravelAppHibernateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new  AnnotationConfigApplicationContext(AppConfi.class);
	        PassengerService passengerService = context.getBean("passengerService",PassengerService.class);

	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("--Bus Booking System--");
	            System.out.println("Press 1 for insert");
	            System.out.println("Press 2 for update");
	            System.out.println("Press 3 for retrieve");
	            System.out.println("Press 4 for delete");
	            System.out.println("Press 5 to quit");
	            System.out.print("Make your choice: ");
	            int choice = scanner.nextInt();
	            
	            switch (choice) {
	                case 1:
	                    System.out.println("\nEnter Passenger Details:");
	                    System.out.print("Name: ");
	                    String name = scanner.next();
	                    System.out.print("Date of Birth (yyyy-MM-dd): ");
	                    String dob = scanner.next();
	                    System.out.print("Phone: ");
	                    String phone = scanner.next();
	                    System.out.print("Email: ");
	                    String email = scanner.next();

	                    PassengerDetails passenger = new PassengerDetails();
	                    passenger.setPassengerName(name);
	                    passenger.setPassengerDob(LocalDate.parse(dob));
	                    passenger.setPassengerPhone(phone);
	                    passenger.setPassengerEmail(email);
	                    
	                    passengerService.createPassenger(passenger);
	                    System.out.println("Passenger added successfully.");
	                    break;
	                
	                case 2:
	                    System.out.print("Enter Passenger ID to update: ");
	                    int idToUpdate = scanner.nextInt();
	                    PassengerDetails existingPassenger = passengerService.getAllPassengers()
	                            .stream()
	                            .filter(p -> p.getPassengerId() == idToUpdate)
	                            .findFirst()
	                            .orElse(null);

	                    if (existingPassenger != null) {
	                        System.out.println("\nUpdate Passenger Details:");
	                        System.out.print("Name (current: " + existingPassenger.getPassengerName() + "): ");
	                        String updatedName = scanner.next();
	                        System.out.print("Date of Birth (current: " + existingPassenger.getPassengerDob() + "): ");
	                        String updatedDob = scanner.next();
	                        System.out.print("Phone (current: " + existingPassenger.getPassengerPhone() + "): ");
	                        String updatedPhone = scanner.next();
	                        System.out.print("Email (current: " + existingPassenger.getPassengerEmail() + "): ");
	                        String updatedEmail = scanner.next();

	                        existingPassenger.setPassengerName(updatedName);
	                        existingPassenger.setPassengerDob(LocalDate.parse(updatedDob));
	                        existingPassenger.setPassengerPhone(updatedPhone);
	                        existingPassenger.setPassengerEmail(updatedEmail);
	                        
	                        passengerService.updatePassenger(existingPassenger);
	                        System.out.println("Passenger updated successfully.");
	                    } else {
	                        System.out.println("Passenger with ID " + idToUpdate + " not found.");
	                    }
	                    break;
	                
//	                case 3:
//	                    System.out.println("\nRetrieve Passenger details");
//	                    List<PassengerDetails> passengers = passengerService.getAllPassengers();
//	                    System.out.println("Passenger_id\tPassenger name\tdob\t\tphone\temail");
//	                    for (PassengerDetails passenger1 : passengers) {
//	                        System.out.println(passenger1.getPassengerId() + "\t" + passenger1.getPassengerName() + "\t" + passenger1.getDob() + "\t" + passenger1.getPhone() + "\t" + passenger1.getEmail());
//	                    }
//	                    break;
	                
	                case 4:
	                    System.out.print("Enter Passenger ID to delete: ");
	                    int idToDelete = scanner.nextInt();
	                    passengerService.deletePassenger(idToDelete);
	                    System.out.println("Passenger deleted successfully.");
	                    break;

	                case 5:
	                    System.out.println("\nQuitting the application.");
	                    context.close();
	                    return;
	                
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	            
	            System.out.print("\nDo you want to continue? Press 'y' for yes or 'n' for no: ");
	            char continueChoice = scanner.next().charAt(0);
	            if (continueChoice != 'y') {
	                break;
	            }
	        }
	        
	        context.close();
	    }
	}