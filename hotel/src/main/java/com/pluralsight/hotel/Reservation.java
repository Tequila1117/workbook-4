package com.pluralsight.hotel;

public class Reservation {
    // Backing variables for the Reservation class
    private String roomType;
    private double price;
     private int numberOfNights;

    // Constructor to initialize reservation details
    public Reservation(String roomType, int numberOfNights) {
        setRoomType(roomType); // Call the setter to set room type and price
        this.numberOfNights = numberOfNights; // Set the number of nights
    }

    // Getter for room type
    public String getRoomType() {
        return roomType;
    }

    // Setter for room type, adjusts price accordingly
    public void setRoomType(String roomType) {
        this.roomType = roomType;
        // Set price based on room type
        if (roomType.equalsIgnoreCase("king")) {
            this.price = 150.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            this.price = 160.00;
        }
    }

    // Calculate total price based on weekend stay
    public double getTotalPrice(boolean isWeekend) {
        double total = price * numberOfNights; // Base total
        if (isWeekend) {
            total *= 1.10; // Increase by 10% for weekend stays
        }
        return total;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights; // Set the number of nights
    }

    public boolean isWeekend() {
        return false;
    }
}