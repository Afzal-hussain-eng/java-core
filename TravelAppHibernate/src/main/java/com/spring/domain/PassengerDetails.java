package com.spring.domain;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Passenger_Details")
public class PassengerDetails {
 

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int passengerId;

    @Column(name = "passenger_name")
    private String passengerName;

    @Column(name = "passenger_dob")
    private LocalDate passengerDob;

    @Column(name = "passenger_phone")
    private String passengerPhone;

    @Column(name = "passenger_email")
    private String passengerEmail;

    // Getters and setters
    
    public int getPassengerId() {
 		return passengerId;
 	}

 	public void setPassengerId(int passengerId) {
 		this.passengerId = passengerId;
 	}

 	public String getPassengerName() {
 		return passengerName;
 	}

 	public void setPassengerName(String passengerName) {
 		this.passengerName = passengerName;
 	}

 	public LocalDate getPassengerDob() {
 		return passengerDob;
 	}

 	public void setPassengerDob(LocalDate passengerDob) {
 		this.passengerDob = passengerDob;
 	}

 	public String getPassengerPhone() {
 		return passengerPhone;
 	}

 	public void setPassengerPhone(String passengerPhone) {
 		this.passengerPhone = passengerPhone;
 	}

 	public String getPassengerEmail() {
 		return passengerEmail;
 	}

 	public void setPassengerEmail(String passengerEmail) {
 		this.passengerEmail = passengerEmail;
 	}
}