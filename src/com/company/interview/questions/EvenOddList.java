package com.company.interview.questions;

import java.util.Arrays;
import java.util.List;

public class EvenOddList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,23,22,81,75,66,8,14);

        //Even List
        list.stream().filter(i->i%2==0).forEach(System.out::println);
        System.out.println("######################################");
        //Odd List
        list.stream().filter(i->i%2!=0).forEach(System.out::println);

    }
}
