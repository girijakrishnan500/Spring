package com.javainuse.service.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.javainuse.dao.EmployeeDao;
import com.javainuse.model.Employee;
//https://stackabuse.com/how-to-test-a-spring-boot-application/

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceImplTest {

	@Mock
	private EmployeeDao employeeDao;

	@InjectMocks
	private EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

	@Test
	public void testEmployee() {
		Employee emp = new Employee();

		employeeServiceImpl.insertEmployee(emp);

		// here we can verify directly with the emp object we are
		// passing while calling to the service
		Mockito.verify(employeeDao).insertEmployee(emp);
	}

	@Test
	public void testEmployeeWithEmployeeId() {
		ArgumentCaptor<Employee> captor = ArgumentCaptor.forClass(Employee.class);

		Employee emp = new Employee();
		emp.setEmpId("emp1");
		emp.setEmpName("testEmp");

		employeeServiceImpl.insertEmployeeUsingEmployeeId("emp1");

		// here we dont have instance of employee object(since it is created in
		// the service class
		// and not passed externally) but we want to verify the employee
		// object which was used to call repository. So we use captor.
		// passing while calling to the service
		Mockito.verify(employeeDao).insertEmployee(captor.capture());

		Employee actual = captor.getValue();
		assertEquals(emp.getEmpName(), actual.getEmpName());
		assertEquals(emp.getEmpId(), actual.getEmpId());

	}

	@Test
	public void testGetAllEmployees() {
		// ArgumentCaptor<Employee> captor = ArgumentCaptor.forClass(Employee.class);

		List<Employee> empList = new ArrayList<Employee>();

		Employee emp1 = new Employee("emp1", "John1");
		Employee emp2 = new Employee("emp2", "John2");
		Employee emp3 = new Employee("emp3", "John3");

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);

		when(employeeDao.getAllEmployees()).thenReturn(empList);

		List<Employee> list = employeeDao.getAllEmployees();
		assertEquals(3, list.size());
		verify(employeeDao, times(1)).getAllEmployees();

	}

}