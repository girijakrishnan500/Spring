package com.compositeDesign.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetails {
	
	private int id;

	private String name;
	
	private String designation;

	private double hra;

	private double da;

	private double basicSalary;

}
