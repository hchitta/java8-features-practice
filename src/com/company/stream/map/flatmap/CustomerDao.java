package com.company.stream.map.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDao {


    public static List<Customer> getCustomers() {
       /* List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"Rob","rob@gmail.com", Arrays.asList("12345678","87654321")));
        customers.add(new Customer(2,"John","jond@gmail.com", Arrays.asList("56348912","55784321")));
        customers.add(new Customer(3,"Dev","devr@gmail.com", Arrays.asList("12341111","99994321")));
        customers.add(new Customer(4,"Christina","chris@gmail.com", Arrays.asList("12345555","77774321")));
        return customers;*/
        return Stream.of(
                (new Customer(1,"Rob","rob@gmail.com", Arrays.asList("12345678","87654321"))),
                (new Customer(2,"John","jond@gmail.com", Arrays.asList("56348912","55784321"))),
                (new Customer(3,"Dev","devr@gmail.com", Arrays.asList("12341111","99994321"))),
                (new Customer(4,"Christina","chris@gmail.com", Arrays.asList("12345555","77774321")))
        ).collect(Collectors.toList());
    }

}
