package com.example.myFirstProject.controller;

import com.example.myFirstProject.entity.Employee;
import com.example.myFirstProject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")

public class EmployeeController {
    //injection - obj creation//
    @Autowired
    EmployeeRepository employeeRepository;
    @PostMapping //creating employee REST API//
    public Employee saveEmp(@RequestBody Employee employee){ // convert json -> java obj grid//
        return employeeRepository.save(employee);
    }
    @GetMapping
    public List<Employee> getAllEmp(){
        return employeeRepository.findAll();
    }

}
