package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static List<Customer> findCommonObjectById(List<Customer> list1, List<Customer> list2){

        List<Customer> commonIdLst = list1.stream().
                filter(x-> list2.stream().anyMatch(y->y.getId().intValue()==x.getId().intValue()))
                .collect(Collectors.toList());

        List<Customer> commonIdLst2 = list1.stream()
                .flatMap(x -> list2.stream().filter(y->y.getId().intValue() == x.getId().intValue()))
                .collect(Collectors.toList());

        System.out.println("commonIdLst2: "+commonIdLst2 );

        return commonIdLst;
    }
    public static void main(String[] args) {
        List<Customer> list1 = Arrays.asList(new Customer(123), new Customer(345), new Customer(839));
        List<Customer> list2 = Arrays.asList(new Customer(123), new Customer(345), new Customer(839));
        System.out.println(Test.findCommonObjectById(list1, list2));
    }



}


class Customer{

    Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                '}';
    }
}