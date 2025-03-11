package java8.flatMap;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private double salary;
    private int age;
    private List<Address> addressList;
    // Constructor now accepts addresses as well
    public Employee(String name, double salary, int age, List<Address> addresses) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.addressList = addresses;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddresses() {
        return addressList;
    }

    public void setAddresses(List<Address> addresses) {
        this.addressList = addresses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", addresses=" + addressList +
                '}';
    }
    public static void main(String[] args) {
        List<Address> addresses1 = new ArrayList<>();
        addresses1.add(new Address("123 Main St", "Hyderabad", "500001"));
        addresses1.add(new Address("456 Elm St", "Hyderabad", "500002"));

        List<Address> addresses2 = new ArrayList<>();
        addresses2.add(new Address("789 Oak St", "Chennai", "600001"));

        // Creating employees with their addresses
        List<Employee> employeeList = new ArrayList<>(List.of(
                new Employee("Sumanth", 200.00, 22, addresses1),
                new Employee("Reddy", 90.00, 23, addresses2)
        ));
        Double averageSalary = employeeList.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(averageSalary);
        List<Employee> listOfEmployeesGreaterThanAvg = employeeList.stream()
                .filter(e -> e.getSalary() > averageSalary)
                .collect(Collectors.toList());
        System.out.println(listOfEmployeesGreaterThanAvg);

        //Create a map with employee ID as key and name as value
        Map<String,Integer>hm=new HashMap<>();
        hm.put("Sumanth",23);
        hm.put("Reddy",21);

        List<String> collect = hm.entrySet()
                .stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);


        List<String> location = employeeList.stream()
                .filter(e -> e.getSalary() > averageSalary)
                .flatMap(e -> e.getAddresses().stream())
                .map(Address::getCity)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(location);

    }
}
