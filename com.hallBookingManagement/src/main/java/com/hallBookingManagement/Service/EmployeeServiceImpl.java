package com.hallBookingManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hallBookingManagement.Dao.EmployeeDao;
import com.hallBookingManagement.models.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
 
    @Autowired
    private EmployeeDao dao;
     
    public void saveEmployee(Employee employee) {
        dao.saveEmployee(employee);
    }
}
