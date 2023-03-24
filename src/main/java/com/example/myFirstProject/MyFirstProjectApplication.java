package com.example.myFirstProject;

import com.example.myFirstProject.entity.Employee;
import com.example.myFirstProject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);


		// Post call ( create a database table insert data)//
	}
@Autowired
EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee= new Employee();
		employee.setEmpName("test");
		employee.setEmpSalary(12345);
		employeeRepository.save(employee);

		Employee employee1= new Employee();
		employee.setEmpName("Check");
		employee.setEmpSalary(21354);
		employeeRepository.save(employee1);


	}
}
