package com.pluralsight.hotel;

public class Room {
    //  variables for the Room class
     int numberOfBeds;
     double price;
    boolean occupied;
     boolean dirty;

    // Constructor to initialize room info
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    // Getters methods
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    // Method to check if the room is available
    public boolean isAvailable() {
        return !occupied && !dirty; // A room is available if it's not occupied and not dirty
    }
}