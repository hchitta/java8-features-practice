package com.company.stream.demo;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {



    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Vamsi");
        list1.add("Haritha");
        list1.add("Srimayi");
        list1.add("Vijaya");
        list1.add("Uma");

        //print names start with v - traditional
        /*for(String s: list1) {
            if(s.startsWith("V")){
                System.out.println(s);
            }
        }*/

        list1.stream().filter(t -> t.startsWith("V")).forEach(t-> System.out.println(t));

    }

}
