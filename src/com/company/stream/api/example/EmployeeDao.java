package com.company.stream.api.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDao {

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Kushi","A",60000));
        employees.add(new Employee(2,"Aadhya","B",30000));
        employees.add(new Employee(3,"Advith","A",80000));
        employees.add(new Employee(4,"Aarohi","A",90000));
        employees.add(new Employee(5,"Sresta","C",15000));
        return employees;
    }

    public static List<Employee> getThousandEmployees() {
        List<Employee> employees = new ArrayList<>();
        for(int i=0; i<1000;i++){
            employees.add(new Employee(1,"employee"+i,"A",Long.valueOf(new Random().nextInt(1000*100))));
        }
        return employees;
    }
}
