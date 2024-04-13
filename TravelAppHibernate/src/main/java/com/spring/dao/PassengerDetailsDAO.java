package com.spring.dao;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.domain.PassengerDetails;

import java.util.List;

@Repository
@Component(value = "passengerDao")
public class PassengerDetailsDAO {
    private  HibernateTemplate hibernateTemplate;

    public PassengerDetailsDAO(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void createPassenger(PassengerDetails passenger) {
        hibernateTemplate.save(passenger);
    }

    public PassengerDetails getPassengerById(int passengerId) {
        return hibernateTemplate.get(PassengerDetails.class, passengerId);
    }

    public List<PassengerDetails> getAllPassengers() {
        return hibernateTemplate.loadAll(PassengerDetails.class);
    }

    public void updatePassenger(PassengerDetails passenger) {
        hibernateTemplate.update(passenger);
    }

    public void deletePassenger(int passengerId) {
        PassengerDetails passenger = getPassengerById(passengerId);
        if (passenger != null) {
            hibernateTemplate.delete(passenger);
        }
    }
}