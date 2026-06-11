package com.example.Springboot.Task._New.Employee.Record.Services;

import com.example.Springboot.Task._New.Employee.Record.Entities.Employee;

import java.util.ArrayList;

public class EmployeeServiceDemo {

        public static void main(String[] args) {

            ArrayList<Employee> employees = new ArrayList<>();

            employees.add(new Employee("E101", "Sara", "HR"));
            employees.add(new Employee("E102", "Ahmed", "IT"));
            employees.add(new Employee("E103", "John", "Finance"));

            System.out.println(" Existing Employees ");
            for (Employee e : employees) {
                System.out.println(e.getEmployeeId() + " -> " + e.getEmployeeName() +
                        " -> " + e.getDepartment());
            }

            Employee newEmployee = new Employee("E104", "Ali", "IT");

            boolean exists = false;

            for (Employee e : employees) {
                if (e.getEmployeeId().equalsIgnoreCase(newEmployee.getEmployeeId())) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {

                employees.add(newEmployee);

                System.out.println("Employee Added Successfully");
                System.out.println("Employee ID: " + newEmployee.getEmployeeId());
                System.out.println("Employee Name: " + newEmployee.getEmployeeName());
                System.out.println("Department: " + newEmployee.getDepartment());
                System.out.println("Status: Created");

            } else {

                System.out.println("Employee ID already exists");
                System.out.println("No employee was created");
            }

            System.out.println("Updated Employee List ");
            for (Employee e : employees) {
                System.out.println(e.getEmployeeId() + " -> " + e.getEmployeeName() +
                        " -> " + e.getDepartment());
            }
        }
    }

