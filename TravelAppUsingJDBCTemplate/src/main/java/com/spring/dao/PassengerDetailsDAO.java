package com.spring.dao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.domain.PassengerDetails;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PassengerDetailsDAO {

    private final JdbcTemplate jdbcTemplate;

    public PassengerDetailsDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Create
    public void createPassenger(PassengerDetails passengerDetails) {
        String sql = "INSERT INTO Passenger_Details (passenger_name, passenger_dob, passenger_phone, passenger_email) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, passengerDetails.getPassengerName(), passengerDetails.getPassengerDob(), passengerDetails.getPassengerPhone(), passengerDetails.getPassengerEmail());
        System.out.println("Passenger record inserted successfully.");
    }

    // Read
    public PassengerDetails getPassengerById(int passengerId) {
        String sql = "SELECT * FROM Passenger_Details WHERE passenger_id = ?";
        return jdbcTemplate.queryForObject(sql, new PassengerRowMapper(),passengerId);
    }

    // Update
    public void updatePassenger(PassengerDetails passengerDetails) {
        String sql = "UPDATE Passenger_Details SET passenger_name = ?, passenger_dob = ?, passenger_phone = ?, passenger_email = ? WHERE passenger_id = ?";
        jdbcTemplate.update(sql, passengerDetails.getPassengerName(), passengerDetails.getPassengerDob(), passengerDetails.getPassengerPhone(), passengerDetails.getPassengerEmail(), passengerDetails.getPassengerId());
        
    }

    // Delete
    public void deletePassengerById(int passengerId) {
        String sql = "DELETE FROM Passenger_Details WHERE passenger_id = ?";
        jdbcTemplate.update(sql, passengerId);
       
    }

    // Get all passengers
    public List<PassengerDetails> getAllPassengers() {
        String sql = "SELECT * FROM Passenger_Details";
        return jdbcTemplate.query(sql, new PassengerRowMapper());
    }

    // RowMapper for PassengerDetails
    private static class PassengerRowMapper implements RowMapper<PassengerDetails> {
        @Override
        public PassengerDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
            PassengerDetails passengerDetails = new PassengerDetails();
            passengerDetails.setPassengerId(rs.getInt("passenger_id"));
            passengerDetails.setPassengerName(rs.getString("passenger_name"));
            passengerDetails.setPassengerDob(rs.getDate("passenger_dob").toLocalDate());
            passengerDetails.setPassengerPhone(rs.getString("passenger_phone"));
            passengerDetails.setPassengerEmail(rs.getString("passenger_email"));
            return passengerDetails;
        }
    }
}