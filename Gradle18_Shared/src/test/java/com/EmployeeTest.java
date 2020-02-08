package com;

import com.util.EmployeeHelper;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {
    @Test
    public void testEmployee(){

        Employee employee = EmployeeHelper.getEmployee("anu");
        Assert.assertEquals("anu",employee.getName());
    }
}
