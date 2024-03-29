package com.ocp.ch4;

import java.util.stream.Stream;

public class Q1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        //System.out.println(stream.limit(2).map(x -> x + "2").forEach(System.out::println););

        //stream.peek(System.out::println).limit(2).map(x -> x + "2").forEach(System.out::println);

        //stream.limit(5).forEach(System.out::println);

        stream.limit(2).map(x -> x + "2").forEach(System.out::println);


    }
}
