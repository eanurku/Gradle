package com.daoimpl;

import com.Employee;
import com.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public Employee getEmployee(String id) {
        return new Employee("Dummy");
    }
}
