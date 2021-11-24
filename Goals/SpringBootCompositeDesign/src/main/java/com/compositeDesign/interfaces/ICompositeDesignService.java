package com.compositeDesign.interfaces;

import com.compositeDesign.model.EmployeeComposite;
import com.compositeDesign.model.EmployeeDetails;

public interface ICompositeDesignService {

	EmployeeComposite calculateSalary(EmployeeDetails employeeDetails) throws Exception;
	
}
