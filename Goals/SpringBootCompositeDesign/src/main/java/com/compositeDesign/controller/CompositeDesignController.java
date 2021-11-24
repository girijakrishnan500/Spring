package com.compositeDesign.controller;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compositeDesign.interfaces.ICompositeDesignService;
import com.compositeDesign.model.EmployeeComposite;
import com.compositeDesign.model.EmployeeDetails;
import com.compositeDesign.model.ResponseUtil;

@RestController
@RequestMapping("/employee")
public class CompositeDesignController {

	private final ICompositeDesignService iCompositeDesignService;

	public CompositeDesignController(ICompositeDesignService iCompositeDesignService) {
		this.iCompositeDesignService = iCompositeDesignService;
	}

	@PostMapping(path = "/getDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmployeeComposite> getSalaryDetails(@Valid @RequestBody EmployeeDetails employeeDetails) throws Exception {
		return ResponseUtil.ok(iCompositeDesignService.calculateSalary(employeeDetails));
	}

}
