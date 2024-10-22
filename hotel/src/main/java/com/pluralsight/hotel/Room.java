package com.pluralsight.hotel;

public class Room {
    //  variables for the Room class
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    // Constructor to initialize room info
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    // Getters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied; // Check if the room is occupied
    }

    public boolean isDirty() {
        return dirty; // Check if the room is dirty
    }

    // Method to check if the room is available
    public boolean isAvailable() {
        return !occupied && !dirty; // A room is available if it's not occupied and not dirty
    }
}