package com.company.functional.exp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo  {

    /*
    Traditional way of using::::
    implements Consumer<Integer>
    @Override
    public void accept(Integer integer) {
        System.out.println("printing: "+integer);
    }*/

    public static void main(String[] args) {
        //traditional way of creating object and invoking method
        //ConsumerDemo consumerDemo = new ConsumerDemo();
        //consumerDemo.accept(20);

        //using lambda expression
        Consumer<Integer> consumer =  (integer)  ->  System.out.println("printing: " + integer);
        consumer.accept(30);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        list1.stream().forEach(consumer);

        list1.stream().forEach( t -> System.out.println("print: " + t));



    }
}
