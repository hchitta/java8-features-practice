package com.company.interview.questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringManipulations {

    public static void main(String[] args) {
        String input = "Java Hungry Blog Alive is Awesome";

        //Given a String, find the first non-repeated character using stream

        //Step 1: String stream
        //input.chars().forEach(ch-> System.out.println((char) ch));
        //Step 2: Convert to Character Object
        //input.chars().mapToObj(ch->Character.valueOf((char)ch)).forEach(System.out::println);
        //Step 3: Convert to lower case
       // input.chars().mapToObj(ch-> Character.toLowerCase(Character.valueOf((char)ch))).forEach(System.out::println);
        //store the chars in map with count
      /*  Character ch1 = input.chars().mapToObj(ch->Character.toLowerCase(Character.valueOf((char) ch)))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();

        System.out.println("FIrst non repeated character"+ch1);*/


        //find the first repeated character in it using Stream functions

        Character character = input.chars().mapToObj(ch -> Character.toLowerCase(Character.valueOf((char) ch)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println("First repeated character::"+character);


    }
}
