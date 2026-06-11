package com.example.Springboot.Task._New.Employee.Record.Entities;

public class Vehicle {

    private String vehicelId;
    private String VehiceModel;
    private Double rentalpriceperday;

    public Vehicle(String vehicelId, String vehiceModel, Double rentalpriceperday) {

        this.vehicelId = vehicelId;
        this.VehiceModel = vehiceModel;
        this.rentalpriceperday = rentalpriceperday;
    }

    public String getVehicelId() {
        return vehicelId;
    }

    public void setVehicelId() {
        this.vehicelId = vehicelId;
    }

    public String getVehiceModel() {
        return VehiceModel;
    }

    public Double getRentalpriceperday() {
        return rentalpriceperday;
    }

    public void setRentalpriceperday() {
        this.rentalpriceperday = rentalpriceperday;
    }

}