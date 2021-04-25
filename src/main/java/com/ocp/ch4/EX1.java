package com.ocp.ch4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EX1 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        /*list.stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);*/

       /* Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);*/

        //System.out.println(1%2);

        Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
        //infinite.limit(5).forEach(System.out::println);
        infinite.limit(3)
                .peek(System.out::println)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::println);
    }
}
