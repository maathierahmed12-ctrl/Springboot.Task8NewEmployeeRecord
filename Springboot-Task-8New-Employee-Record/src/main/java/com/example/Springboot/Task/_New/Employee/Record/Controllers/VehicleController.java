package com.example.Springboot.Task._New.Employee.Record.Controllers;

import com.example.Springboot.Task._New.Employee.Record.Entities.Vehicle;
import com.example.Springboot.Task._New.Employee.Record.Entities.VehicleManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleManager vehicleManager;

    public VehicleController(VehicleManager vehicleManager) {
        this.vehicleManager = vehicleManager;
    }

    @PostMapping("/add")
    public String addVehicle(@RequestParam String id,
                             @RequestParam String model,
                             @RequestParam double price) {

        Vehicle vehicle = new Vehicle(id, model, price);

        return vehicleManager.addVehicle(vehicle);
    }

    @GetMapping("/all")
    public String showAll() {
        return vehicleManager.displayVehicles();
    }
}

