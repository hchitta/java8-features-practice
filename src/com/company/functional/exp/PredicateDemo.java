package com.company.functional.exp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo  {

   /*  older way::
   implements Predicate<Integer>
    @Override
    public boolean test(Integer integer) {
        if(integer % 2 == 0) return  true;
        return false;
    }*/

    public static void main(String[] args) {
        //old way
        //PredicateDemo predicateDemo = new PredicateDemo();
        //System.out.println(predicateDemo.test(7));

        //new way1
      /*  Predicate<Integer> predicate = (integer) -> {
            if(integer % 2 == 0) return  true;
            return false;
        };*/

        //new way2
        Predicate<Integer> predicate = (t) -> t % 2 == 0;

        System.out.println(predicate.test(222));

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);

        list1.stream().filter(predicate).forEach( t -> System.out.println("print: even:" + t));

        list1.stream().filter(t->t%2!=0).forEach(t-> System.out.println("print odd:"+t));

    }
}
