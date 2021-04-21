package main.java.com.mytest;

import java.util.Arrays;
import java.util.List;

public class ListStreamExample {

    public static void main(String[] args) {

        List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");

        //list size
        long l = listVal.stream().count();
        System.out.println(l);

        //count all word length
        listVal.forEach(e -> System.out.println(e.length()));

        listVal.stream().filter(e -> e.length() > 3).forEach(e -> System.out.println(e.length()));


        //enables the code to print the count of string elements whose length is greater than three
       System.out.println(
       listVal.stream().filter( e -> e.length() > 3).count()
       );

    }
}
