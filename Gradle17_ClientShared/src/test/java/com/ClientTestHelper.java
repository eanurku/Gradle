package com;

import com.util.EmployeeHelper;

public class ClientTestHelper {

    Client getClient(String id){

        Employee emp= EmployeeHelper.getEmployee("test");
        if (emp.getName().equals("id"))
            return null;
        return new Client("id");
    }
}
