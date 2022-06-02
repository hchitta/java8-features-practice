package com.company.interview.questions;

import java.util.Arrays;
import java.util.List;

public class NumStartsWithOne {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,11,66,18,90,121,10,22,1);

        //numbers starting with 1 using Stream

        list.stream()
                .map(s->s+"")//convert Integer to  - String - transformation
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);

    }
}
