package com.hallBookingManagement.Dao;

import org.springframework.stereotype.Repository;

import com.hallBookingManagement.models.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao{
 
    public void saveEmployee(Employee employee) {
        persist(employee);
    }
}
