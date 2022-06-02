package com.company.interview.questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElements {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,45,11,56,11,89,45,10,45);

        //duplicate elements in a given integers list in java using Stream

        Set<Integer> set = new HashSet<>();

        //remove duplicate from a list and print it
        //list.stream().filter(l -> set.add(l)).forEach(System.out::println);

       // System.out.println("#######################################");

        //print duplicate numbers
       Set<Integer> collect = list.stream()
                .filter(l -> !set.add(l))
                .collect(Collectors.toSet());

        collect.stream().forEach(System.out::println);


    }
}
