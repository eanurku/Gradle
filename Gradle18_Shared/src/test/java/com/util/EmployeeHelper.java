package com.util;

import com.Employee;

public class EmployeeHelper {

    public static Employee getEmployee(String empname){

        Employee emp=new Employee(empname);
        return emp;
    }
}
