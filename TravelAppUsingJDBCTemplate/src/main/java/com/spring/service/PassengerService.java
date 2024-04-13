package com.spring.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.PassengerDetailsDAO;
import com.spring.domain.PassengerDetails;

import java.util.List;

@Service
public class PassengerService {
    private final PassengerDetailsDAO passengerDetailsDAO;

    @Autowired
    public PassengerService(PassengerDetailsDAO passengerDetailsDAO) {
        this.passengerDetailsDAO = passengerDetailsDAO;
    }

    public void createPassenger(PassengerDetails passengerDetails) {
        passengerDetailsDAO.createPassenger(passengerDetails);
    }
    
    
    public void updatePassenger(PassengerDetails passengerDetails) {
        passengerDetailsDAO.updatePassenger(passengerDetails);
    }

    public PassengerDetails getPassengerById(int passengerId) {
        return passengerDetailsDAO.getPassengerById(passengerId);
    }
    
    public List<PassengerDetails> getAllPassengers() {
        return passengerDetailsDAO.getAllPassengers();
    }
    

    public void deletePassengerById(int passengerId) {
        passengerDetailsDAO.deletePassengerById(passengerId);
    }

    
}