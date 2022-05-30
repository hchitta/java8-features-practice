package com.company.stream.api.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Kushi","Consulting",40000));
        employees.add(new Employee(2,"Aadhya","Audit",80000));
        employees.add(new Employee(3,"Advith","Tax",50000));
        employees.add(new Employee(4,"Aarohi","Deloitte Digital",100000));
        employees.add(new Employee(5,"Sresta","AI",70000));
        return employees;
    }
}
