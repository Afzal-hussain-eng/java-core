package com.learning.core.day03session2.D03P08;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Implementing Comparable interface based on natural ordering (price)
    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }

    // Override toString method
    @Override
    public String toString() {
        return name + " " + price;
    }

    // Override hashcode and equals methods
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }
}
