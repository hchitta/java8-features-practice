package com.company;

interface Calculator {
    //public void switchOn();
    //void sum(int input);
    int sub(int i1, int i2);
}

public class CalculatorImpl{

    // () -> {body}
    public static void main(String[] args) {
       /* Calculator calculator = () -> {
            System.out.println("Switch On");
        };
        calculator.switchOn();*/

        /*Calculator calculator = (input) -> {
            System.out.println("Sum::"+input);
        };
        calculator.sum(525);*/

        Calculator calculator = (i1, i2) -> (i1-i2);;
        System.out.println("Diff: "+ calculator.sub(10,6));


    }
}
