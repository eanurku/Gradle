package java.com;

import com.Employee;
import com.daoimpl.EmployeeDaoImpl;
import org.junit.Assert;

public class Integtest1 {

    public static void main(String[] args) {
        Employee emp= new Employee("id");

        EmployeeDaoImpl impl=new EmployeeDaoImpl();
        Employee emp1 = impl.getEmployee("id");
        Assert.assertEquals(emp,emp1);


    }
}
