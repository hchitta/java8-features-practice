package com.company.stream.sort;

import com.company.stream.api.example.Employee;

import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("eight",8);
        map.put("four",4);
        map.put("ten",10);
        map.put("two",2);

        List<Map.Entry<String,Integer>> entries =  new ArrayList<>(map.entrySet());

        //traditional comparator approach
       /* Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        */
        //map.forEach((key,value)-> System.out.println(key));
        //map.entrySet().stream().forEach(obj-> System.out.println(obj));

        //sorting map using lamda expression
        //Collections.sort(entries,((o1, o2) -> o1.getValue().compareTo(o2.getValue())));

       /* for(Map.Entry<String,Integer> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }*/

        //sorting uisng stream api based on value in map
        //entries.stream().sorted((o1,o2)->o1.getValue()-o2.getValue()).forEach(System.out::println);
        //sorting uisng stream api based on key in map
        //entries.stream().sorted((o1,o2)->o1.getKey().compareTo(o2.getKey())).forEach(System.out::println);
        //sorting uisng stream api - method reference based on key in map
        //entries.stream().sorted(Comparator.comparing(o1->o1.getKey())).forEach(System.out::println);
       // entries.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        //System.out.println("****************************");
      //  entries.stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        //cutsom object as key, sort using traditional comparator

      /*  Map<Employee,Integer> empMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });*/
        //cutsom object as key, sort using lambda expression
       // Map<Employee,Integer> empMap = new TreeMap<>((o1,o2)-> o1.getName().compareTo(o2.getName()));

        Map<Employee,Integer> empMap = new TreeMap<>((o1,o2)->(int) (o1.getSalary() - o2.getSalary()));
        empMap.put(new Employee(1,"Kushi","Consulting",40000),20);
        empMap.put(new Employee(2,"Aadhya","Audit",80000),89);
        empMap.put(new Employee(3,"Advith","Tax",50000),40);
        empMap.put(new Employee(4,"Aarohi","Deloitte Digital",100000),71);
        empMap.put(new Employee(5,"Sresta","AI",70000),120);

        //custom object as key, sort using stream api
        empMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed()))
                .forEach(System.out::println);
       /* empMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);*/

        //System.out.println(empMap);


    }
}
