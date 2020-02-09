package com;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) throws JsonProcessingException {

        Employee employee=new Employee("testEmployee");

        ObjectMapper mapper=new ObjectMapper();

        String empString=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);

        System.out.println(empString);
    }
}
