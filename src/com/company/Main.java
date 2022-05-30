package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        lambdaExample();
    }

    //through which we represent anonymous function
    public static void lambdaExample() {

    }

    //functional interface - one abstract method, multiple default and static methods
    //lamda expression () -> {body}
    //consumer - functional interface -  void accept(T t) - foreach
    // predicate - functional interface - conditional check - boolean test(T t) - filter
    // supplier example - functioanl interface - T get() - no input output is expected
    //Stream in Java - API used to process collection of objects
    //why stream - functional programming,code reduce,bulk operation
    //foreach - iteration
    //filter - conditional check
    //map flatmap; flapmap = map + flattering
    //map Stream<R> map(Stream<T> input) - data transformation; one to one mapping
    //map [a,b,c,d] -> [A,B,C,D] - transforming data from one stream to another stream is map
    //flatmap - one to many mapping - converting stream of streams into single stream is called flatmap
    //flatmap [[1,2],[3,4],[5,6]] -> [1,2,3,4,5,6]
    //Optional class - to avoid null pointer exceptions


}
