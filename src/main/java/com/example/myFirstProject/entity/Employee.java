package com.example.myFirstProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "emp")
public class Employee {
    @Id //- ACTas primary key//
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empId;
    private String empName;
    private Integer empSalary;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Integer empSalary) {
        this.empSalary = empSalary;
    }
}
