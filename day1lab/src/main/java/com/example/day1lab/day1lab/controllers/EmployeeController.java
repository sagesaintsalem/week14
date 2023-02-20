package com.example.day1lab.day1lab.controllers;

import com.example.day1lab.day1lab.models.Employee;
import com.example.day1lab.day1lab.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

    @GetMapping(value = "/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeRepo.findById(id);
    }
}
