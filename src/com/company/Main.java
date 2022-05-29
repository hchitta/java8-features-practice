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
}
