package com.company.parallel_stream;

import com.company.stream.api.example.Employee;
import com.company.stream.api.example.EmployeeDao;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {

        long start;
        long end;

       /* start=System.currentTimeMillis();
        IntStream.range(1,100).forEach(System.out::println);
        end=System.currentTimeMillis();
        System.out.println("plain stream took time::"+(end-start));

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        start=System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);
        end=System.currentTimeMillis();
        System.out.println("parallel stream took time::"+(end-start));*/

        /*IntStream.range(1,10).forEach(x->{
            System.out.println("Thread name: "+ Thread.currentThread().getName()+ " " + x);
        });

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        IntStream.range(1,10).parallel().forEach(x->{
            System.out.println("Thread name: "+ Thread.currentThread().getName()+ " " + x);
        });*/

        List<Employee> employees = EmployeeDao.getThousandEmployees();

        //normal stream
        start=System.currentTimeMillis();
        double avgSalWithStream = employees.stream().map(employee -> employee.getSalary()).mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();
        System.out.println("normal stream took time::"+(end-start)+": Avg Sal :"+avgSalWithStream);

        //parallel stream
        start=System.currentTimeMillis();
        double avgSalWithParallelStream = employees.parallelStream().map(employee -> employee.getSalary()).mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();
        System.out.println("parallel stream took time::"+(end-start)+": Avg Sal :"+avgSalWithParallelStream);

    }
}
