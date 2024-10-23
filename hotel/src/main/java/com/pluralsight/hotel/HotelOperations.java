package com.pluralsight.hotel;

import java.util.ArrayList;

public class HotelOperations {
    public static void main(String[] args) {
        // Create a list of rooms
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(1, 150.0, false, false)); // King room
        rooms.add(new Room(2, 160.0, false, true)); // Dirty double room


        // Create a reservation
        Reservation reservation = new Reservation("king", 3);
        double totalPrice = reservation.getTotalPrice(true); // Assuming it's a weekend
        System.out.println("Total Price for Stay: $" + totalPrice);

        // Create and instance of employee class, use "new" to create an employee and The employee constructor takes parameters to initialize the object's properties
        Employee employee = new Employee(1, "Janet Jackson", "Housekeeping", 22.00, 43);
        System.out.println("Employee total pay: $" + employee.getTotalPay());



    }
}