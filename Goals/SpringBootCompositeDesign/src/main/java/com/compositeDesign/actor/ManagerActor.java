package com.compositeDesign.actor;

import org.springframework.stereotype.Component;

import com.compositeDesign.interfaces.IActor;
import com.compositeDesign.model.EmployeeComposite;

@Component
public class ManagerActor implements IActor<EmployeeComposite> {

	@Override
	public EmployeeComposite act(EmployeeComposite data) throws Exception {
		
		double HRA = data.getEmployeeDetails().getHra();
		double DA = data.getEmployeeDetails().getDa();
		HRA = (HRA/100) * data.getEmployeeDetails().getBasicSalary();
		DA = (DA/100) * data.getEmployeeDetails().getBasicSalary();
		
		data.setNetSalary( HRA + DA +data.getEmployeeDetails().getBasicSalary());
		
		return data;
	}

}
