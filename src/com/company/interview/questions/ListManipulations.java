package com.company.interview.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListManipulations {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,45,11,56,11,89,45,10,45);

        //first element of the list
        list.stream().findFirst().ifPresent(System.out::println);

        //sum of elements present in list
        int sum = list.stream().mapToInt(i -> i).sum();
        System.out.println("Sum :: "+sum);

        //count of numbers in list
        long count = list.stream().count();
        System.out.println("Count ::"+count);

        //max value
        int asInt = list.stream().mapToInt(i -> i).max().getAsInt();
        System.out.println("Maximum number::"+asInt);

        //min value
        int asInt1 = list.stream().mapToInt(i -> i).min().getAsInt();
        System.out.println("Minimum value::"+asInt1);

        //sort list
        System.out.println("Sorted List");
        list.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("##########################");
        //reverse sort
        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
