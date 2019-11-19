package com.javainuse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javainuse.service.EmployeeService;

//https://www.javainuse.com/pcf/pcf-sql

@SpringBootApplication
public class SpringBootJdbcApplication {

	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}
}