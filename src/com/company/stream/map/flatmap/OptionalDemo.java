package com.company.stream.map.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalDemo {

    public static void main(String[] args) {
        Customer customer = new Customer(1,"Max","abcd", Arrays.asList("123","456"));

        //empty
        //of
        //ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        //System.out.println(emptyOptional);

        //Optional<String> emailOptional = Optional.of(customer.getEmail());
        //System.out.println(emailOptional);

        /*Optional<String> emailOptional1 = Optional.ofNullable(customer.getEmail());
        if(emailOptional1.isPresent()) {
            System.out.println(emailOptional1.get());
        }*/
        //System.out.println(emailOptional1.orElse("default@gmail.com"));
       // System.out.println(emailOptional1.orElseThrow(()-> new IllegalArgumentException("email not found")));
       // System.out.println(emailOptional1.map(String::toUpperCase).orElseGet(() -> "default email"));

        System.out.println(getCustomerByEmailId("chris@gmail.com"));

    }

    public static Customer getCustomerByEmailId(String emailId) {
        List<Customer> customers = CustomerDao.getCustomers();
        Optional<Customer> cutomer = customers.stream().filter(customer -> emailId.equalsIgnoreCase(customer.getEmail())).findAny();
        return cutomer.orElseThrow(()->new IllegalArgumentException("no customer present with that email"));
    }
}
