package com.company.stream.map.flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class FlatVsFlatMap {

    public static void main(String[] args) {
        List<Customer> customers = CustomerDao.getCustomers();
        //List<Customer> convert List<String>(all emails) -> data transformation
        //mapping logic - customer -> customer.getEmail() - one to one mapping
        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        List<List<String>> phones = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phones);
        // one to many mapping - customer -> customer.getPhoneNumbers
        List<String> phoneNumbers = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNumbers);

    }
}
