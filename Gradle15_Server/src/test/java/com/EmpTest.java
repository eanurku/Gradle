package com;

import com.util.EmployeeHelper;
import org.junit.Assert;
import org.junit.Test;

public class EmpTest {

    @Test
    public void testemp(){

        Employee emp = EmployeeHelper.getEmployee("newEmployee");
        Assert.assertEquals("newEmployee",emp.getName());
    }
}
