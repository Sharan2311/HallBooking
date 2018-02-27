package com.hallBookingManagement.TestFlow;

import java.math.BigDecimal;

import org.joda.time.LocalDate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.hallBookingManagement.Service.EmployeeService;
import com.hallBookingManagement.configuration.AppConfiguration;
import com.hallBookingManagement.models.Employee;

public class TestFlow {
	 
    public static void main(String args[]) {
        
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        
        EmployeeService service = (EmployeeService) context.getBean("employeeService");
 
        /*
         * Create Employee1
         */
       /* Employee employee1 = new Employee();
        employee1.setName("Han Yenn");
        employee1.setJoiningDate(new LocalDate(2010, 10, 10));
        employee1.setSalary(new BigDecimal(10000));
        employee1.setSsn("ssn00000001");
 
        
         * Create Employee2
         
        Employee employee2 = new Employee();
        employee2.setName("Dan Thomas");
        employee2.setJoiningDate(new LocalDate(2012, 11, 11));
        employee2.setSalary(new BigDecimal(20000));
        employee2.setSsn("ssn00000002");*/
        Employee employee3 = new Employee();
        employee3.setName("Sharan");
        employee3.setJoiningDate(new LocalDate(2013, 12, 12));
        employee3.setSalary(new BigDecimal(20001));
        employee3.setSsn("ssn00000003");
        /*
         * Persist both Employees
         */

        service.saveEmployee(employee3);
    }
}
