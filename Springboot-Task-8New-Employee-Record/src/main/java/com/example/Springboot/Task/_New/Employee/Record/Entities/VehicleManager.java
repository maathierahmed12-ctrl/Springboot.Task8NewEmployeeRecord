package com.example.Springboot.Task._New.Employee.Record.Entities;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleManager {

    private List<Vehicle> vehicles = new ArrayList<>();

    public VehicleManager() {
        vehicles.add(new Vehicle("V101", "Toyota", 20.));
        vehicles.add(new Vehicle("V102", "Nissan", 18.));
        vehicles.add(new Vehicle("V103", "Hyundai", 22.));
    }

    public String addVehicle(Vehicle vehicle) {

        for (Vehicle v : vehicles) {
            if (v.getVehicelId().equalsIgnoreCase(vehicle.getVehicelId())) {
                return "Vehicle ID already exists";
            }
        }

        vehicles.add(vehicle);
        return "Vehicle added successfully";
    }

    public String displayVehicles() {

        StringBuilder sb = new StringBuilder();

        for (Vehicle v : vehicles) {
            sb.append(v.getVehicelId())
                    .append(" -> ")
                    .append(v.getVehiceModel())
                    .append(" -> ")
                    .append(v.getRentalpriceperday())
                    .append("..");
        }

        return sb.toString();
    }
}

