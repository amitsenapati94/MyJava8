package com.mytest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {


        List<String> nL = Arrays.asList("Jim", "John", "Jeff");

        Function<String, String> funVal = s -> "Hello : ".concat(s);

        /*List<String> list = nL.stream()
          .map(funVal)
          .collect(Collectors.toList());

        list.forEach(System.out::println);
        */

        //use of peek(System.out::print)
        //This won't print anything as peek is not a terminal operator.This is an intermediate operation.
        /*nL.stream()
                .map(funVal)
                .peek(System.out::print);*/


        nL.stream()
                .map(funVal)
                .peek(System.out::print)
                .count();
    }
}
