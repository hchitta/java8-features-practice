package com.company.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Vamsi");
        list1.add("Haritha");
        list1.add("Srimayi");
        list1.add("Vijaya");
        list1.add("Uma");

        //traditional method
       /* for(String s: list1) {
            System.out.println(s);
        }*/

        // stream foreach method
        list1.stream().forEach(t-> System.out.println(t));


        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Apple");
        hashMap.put(2,"Banana");
        hashMap.put(3,"Grapes");
        hashMap.put(4,"Orange");
        hashMap.put(5,"Dates");

        hashMap.forEach((key,value)-> System.out.println(key +"--"+value));
        hashMap.entrySet().stream().forEach(obj-> System.out.println(obj));
        System.out.println("on filter");
        hashMap.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj-> System.out.println(obj));
    }
}
