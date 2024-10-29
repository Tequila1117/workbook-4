package com.pluralsight.dealership;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {
    private final String filePath = "src/main/resources/inventory.csv"; // File path for dealership data

    public Dealership getDealership() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine();
        String[] dealershipInfo = line.split("\\|");
        Dealership dealership = new Dealership(dealershipInfo[0], dealershipInfo[1], dealershipInfo[2]);

        while ((line = reader.readLine()) != null) {
            String[] vehicleData = line.split("\\|");
            Vehicle vehicle = new Vehicle(
                    Integer.parseInt(vehicleData[0]),
                    Integer.parseInt(vehicleData[1]),
                    vehicleData[2],
                    vehicleData[3],
                    vehicleData[4],
                    vehicleData[5],
                    Integer.parseInt(vehicleData[6]),
                    Double.parseDouble(vehicleData[7])
            );
            dealership.addVehicle(vehicle); // Add vehicle to dealership inventory
        }
        reader.close();
        return dealership; // Return the populated dealership object
    }

    public void saveDealership(Dealership dealership) {
        // To be implemented later
    }
}