/*package com.javainuse.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import com.javainuse.dao.EmployeeDao;
import com.javainuse.dao.impl.EmployeeDaoImpl;
import com.javainuse.model.Employee;
import com.javainuse.service.impl.EmployeeServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestController {

	
	@InjectMocks
	EmployeeDaoImpl imp =  new EmployeeDaoImpl();
	
    @Mock
    EmployeeDao dao;
 
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
     
    @Test
    public void getAllEmployees()
    {
    	ArgumentCaptor<Employee> captor = ArgumentCaptor.forClass(Employee.class);
        List<Employee> list = new ArrayList<Employee>();
        Employee empOne = new Employee("emp1", "John");
        Employee empTwo = new Employee("emp2", "Alex");
        Employee empThree = new Employee("emp3", "Steve");
         
        list.add(empOne);
        list.add(empTwo);
        list.add(empThree);
            
        //test
        //List<Employee> empList = imp.getAllEmployees();
         
        //assertEquals(3, empList.size());
        //verify(dao,times(1)).getAllEmployees();
        Mockito.verify(dao).getAllEmployees();
        Employee actual = captor.getValue();
    	assertEquals(((Employee) list).getEmpName(), actual.getEmpName());
    	assertEquals(((Employee) list).getEmpId(), actual.getEmpId());
        when(dao.getAllEmployees()).thenReturn(list);
    }
     
    Mockito.verify(employeeDao).insertEmployee(captor.capture());

	Employee actual = captor.getValue();
	assertEquals(emp.getEmpName(), actual.getEmpName());
	assertEquals(emp.getEmpId(), actual.getEmpId());

	
}
*/