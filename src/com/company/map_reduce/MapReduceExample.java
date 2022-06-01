package com.company.map_reduce;

import com.company.stream.api.example.EmployeeDao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,7,1,8,5,9);

        //sum of elements in an array or list
        int sum = 0;
        for(int no:list) {
            sum = sum + no;
        }
        System.out.println("sum is:"+sum);

        int sum1 = list.stream().mapToInt(i -> i).sum();
        System.out.println("sum approach 2:"+sum1);

        Integer reduceSum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum approach 2:"+reduceSum);

        Optional<Integer> reduceSumWithMethodRef = list.stream().reduce(Integer::sum);
        System.out.println("reduce sum with method reference:"+reduceSumWithMethodRef.get());

        Integer mulValue = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println("multiplication:"+mulValue);

        //Integer maxValue = list.stream().reduce(0, (a, b) -> a > b ? a : b);
        Integer maxValue = list.stream().reduce(Integer::max).get();
        System.out.println("Maximum value from a list:"+maxValue);

        Integer minValue = list.stream().reduce(Integer::min).get();
        System.out.println("Minimum value:"+minValue);

        List<String> words = Arrays.asList("corejava","spring","hibernate");
        String longestString = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longestString);

        //get employees whose dept is A
        //get salaries
     double avgSal =   EmployeeDao.getEmployees().stream()
                .filter(employee -> employee.getDept().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i->i)
                .average().getAsDouble();
        System.out.println(avgSal);

        double sumSal =   EmployeeDao.getEmployees().stream()
                .filter(employee -> employee.getDept().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i->i)
                .sum();
        System.out.println(sumSal);
    }
}
