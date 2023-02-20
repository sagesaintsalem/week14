package com.example.day1lab.day1lab;

import com.example.day1lab.day1lab.models.Employee;
import com.example.day1lab.day1lab.repos.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class Day1labApplicationTests {
	@Autowired
	EmployeeRepo employeeRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void createAnEmployee(){
		Employee employee = new Employee("Karen Finance", 32, "02384", "karen@finance.com");
		employeeRepo.save(employee);
	}



}
