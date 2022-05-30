package com.company.stream.sort;

import com.company.stream.api.example.Employee;
import com.company.stream.api.example.EmployeeDao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//Sort list[primitive and custom] using lambda and stream api
public class SortListDemo {

    public static void main(String[] args) {

        //sorting primitive data types
        /*List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);*/

       /* Collections.sort(list); //ascending order
        Collections.reverse(list); // once sorted then reverse order descending
        System.out.println(list);*/

        //custom object employees sorting based on salary using comparator
        List<Employee> employees = EmployeeDao.getEmployees();
        /*
        Collections.sort(employees, new EmpComparator());
        Collections.reverse(employees);
        System.out.println(employees);*/

        //custom object employees sorting based on salary using ananymous function
      /*  Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });
        System.out.println(employees);*/

        //custom object employees sorting based on salary using lambda function
        /*Collections.sort(employees, (o1,o2) -> (int) ((int) o2.getSalary() - o1.getSalary()));
        System.out.println(employees);*/

        //custom object employees sorting based on salary using stream api

        //custom object employees sorting based on salary
        //EmployeeDao.getEmployees().stream().sorted((t1,t2)->(int)t2.getSalary()- (int)t1.getSalary()).forEach(t-> System.out.println(t.getSalary()));
        //EmployeeDao.getEmployees().stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).forEach(System.out::println);
       // EmployeeDao.getEmployees().stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);
        EmployeeDao.getEmployees().stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

    }
}

class EmpComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary()-o2.getSalary());
    }
}
