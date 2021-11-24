package com.compositeDesign.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeComposite {

	private String errorMessage;

	private EmployeeDetails employeeDetails;

	private double netSalary;

}
