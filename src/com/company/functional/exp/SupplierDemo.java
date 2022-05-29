package com.company.functional.exp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo  {

   /* implements Supplier<String>
    @Override
    public String get() {
        return "Hi Hello";
    }*/

    public static void main(String[] args) {
        //Supplier<String> supplier =  new SupplierDemo();
        //System.out.println(supplier.get());

        Supplier<String> supplier = () -> "Hi Hello World";
        //System.out.println(supplier.get());

        List<String> list1 = Arrays.asList();
        System.out.println(list1.stream().findAny().orElseGet(supplier));
    }
}
