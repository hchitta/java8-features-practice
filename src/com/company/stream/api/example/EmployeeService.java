package com.company.stream.api.example;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    public static List<Employee> evaluateTaxUsers(String input) {
        return
                (input.equalsIgnoreCase("tax"))
                ? EmployeeDao.getEmployees().stream().filter(obj->obj.getSalary()>60000).collect(Collectors.toList())
                        : EmployeeDao.getEmployees().stream().filter(obj->obj.getSalary()<=60000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        evaluateTaxUsers("non tax").stream().forEach(obj-> System.out.println(obj));
    }

}
