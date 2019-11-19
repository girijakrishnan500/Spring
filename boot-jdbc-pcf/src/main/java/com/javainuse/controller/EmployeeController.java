package com.javainuse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;
import com.javainuse.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> firstPage() {

		return empService.getAllEmployees();

	}

	@GetMapping(value = "/dbfetch")
	public List<Employee> firstPage1(@RequestParam(value = "empName", required = true) String empName) {
		
		System.out.println("********GETBYNAME*****");
		return empService.getEmployeeByID(empName);
	}

}
