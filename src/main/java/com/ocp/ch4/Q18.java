package com.ocp.ch4;

import java.util.stream.DoubleStream;

public class Q18 {

    public static void main(String[] args) {

        DoubleStream s = DoubleStream.of(1.2, 2.4);
        //s.peek(System.out::println).filter(x -> x > 2).count();

        long l = s.filter(x -> x > 2).peek(System.out::println).count();

        System.out.println(l);

    }
}
