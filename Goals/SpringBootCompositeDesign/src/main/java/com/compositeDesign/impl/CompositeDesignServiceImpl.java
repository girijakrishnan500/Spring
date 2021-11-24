package com.compositeDesign.impl;

import org.springframework.stereotype.Service;

import com.compositeDesign.actor.ManagerActor;
import com.compositeDesign.interfaces.ICompositeDesignService;
import com.compositeDesign.model.EmployeeComposite;
import com.compositeDesign.model.EmployeeDetails;

@Service
public class CompositeDesignServiceImpl implements ICompositeDesignService {

	private final ManagerActor managerActor;

	public CompositeDesignServiceImpl(ManagerActor managerActor) {
		this.managerActor = managerActor;
	}

	@Override
	public EmployeeComposite calculateSalary(EmployeeDetails employeeDetails) throws Exception {

		EmployeeComposite composite = new EmployeeComposite();
		composite.setEmployeeDetails(employeeDetails);

		String designation = employeeDetails.getDesignation();

		if (designation.equalsIgnoreCase("MANAGER")) {
			composite = managerActor.act(composite);
		}

		else if (designation.equalsIgnoreCase("DEVELOPER")) {
			composite = managerActor.act(composite);
		}

		else if (designation.equalsIgnoreCase("TESTER")) {
			composite = managerActor.act(composite);
		}

		else {
			composite.setErrorMessage("Give valid designation");
		}

		return composite;
	}

}
