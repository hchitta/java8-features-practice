# java8-features-practice
java8 concepts

 Functional Interfaces:
 
1. contains one and only one abstract method and can have any number of default and static methods. @FunctionalInterface annotation
2. Java 8 provides predefined functional interfaces to deal with functional programming by using lambda and method references. 
    Example - Consumer Supplier Predicate BiFunction

Sorting using streams
EmployeeDao.getEmployees().stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);

map vs flatmap
customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());

filer using streams
customers.stream().filter(customer -> emailId.equalsIgnoreCase(customer.getEmail())).findAny();
list1.stream().filter(t -> t.startsWith("V")).forEach(t-> System.out.println(t));
EmployeeDao.getEmployees().stream().filter(obj->obj.getSalary()>60000).collect(Collectors.toList())
