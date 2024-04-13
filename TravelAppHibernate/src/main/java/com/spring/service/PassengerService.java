package com.spring.service;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.PassengerDetailsDAO;
import com.spring.domain.PassengerDetails;

import java.util.List;

@Service
@Component(value = "passengerService")
public class PassengerService {
    private  PassengerDetailsDAO passengerDetailsDAO;

    public PassengerService(PassengerDetailsDAO passengerDetailsDAO) {
        this.passengerDetailsDAO = passengerDetailsDAO;
    }

    @Transactional
    public void createPassenger(PassengerDetails passenger) {
        passengerDetailsDAO.createPassenger(passenger);
    }

    @Transactional(readOnly = true)
    public PassengerDetails getPassengerById(int passengerId) {
        return passengerDetailsDAO.getPassengerById(passengerId);
    }

    @Transactional(readOnly = true)
    public List<PassengerDetails> getAllPassengers() {
        return passengerDetailsDAO.getAllPassengers();
    }

    @Transactional
    public void updatePassenger(PassengerDetails passenger) {
        passengerDetailsDAO.updatePassenger(passenger);
    }

    @Transactional
    public void deletePassenger(int passengerId) {
        passengerDetailsDAO.deletePassenger(passengerId);
    }
}