package com.pluralsight.hotel;

public class Employee {
    // variables for the Employee class
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // Constructor to initialize employee details
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // Derived getters
    public double getTotalPay() {
        return payRate * hoursWorked; // Calculate total pay
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40); // Calculate regular hours (max 40)
    }

    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40, 0); // Calculate overtime hours
    }

    // Getters for other attributes
    public int getEmployeeId() {
        return employeeId; // Return employee ID
    }

    public String getName() {
        return name; // Return employee name
    }

    public String getDepartment() {
        return department; // Return employee department
    }

    public double getPayRate() {
        return payRate; // Return pay rate
    }

    public double getHoursWorked() {
        return hoursWorked; // Return hours worked
    }
}


