package com.example.Springboot.Task._New.Employee.Record.Services;

import com.example.Springboot.Task._New.Employee.Record.Entities.Vehicle;
import com.example.Springboot.Task._New.Employee.Record.Entities.VehicleManager;

public class VehicleDemo {

        public static void main(String[] args) {

            VehicleManager manager = new VehicleManager();

            manager.displayVehicles();

            System.out.println(" POST Operation ---");

            Vehicle newVehicle = new Vehicle("V104", "Kia Sportage", 30.0);

            System.out.println(manager.addVehicle(newVehicle));

            System.out.println();

            manager.displayVehicles();
        }
    }


