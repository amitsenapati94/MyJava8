package com.mytest;

import java.util.Arrays;
import java.util.List;

public class ListStreaming {

    public static void main(String[] args) {

        List<String> empDetails = Arrays.asList("100, Robin, HR", "200, Mary, AdminServices",
                "101, Peter, HR");

        empDetails.stream()
                .filter(s-> s.contains("1"))
                .sorted()
                .forEach(System.out::println); //line n1


        List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");

        System.out.println(listVal.stream().filter(x -> x.length()>3).count());


    }
}
