package main.java.com.mytest;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class IntStreamExample {

    public static void main(String[] args) {


    IntStream stream = IntStream.of(1,2,3);


    //This line won't compile.java.util.function.IntUnaryOperator can't be applied to Integer
    //stream.map expects IntUnaryOperator
    //IntFunction<Integer> inFu= x -> y -> x*y;//line n1

    //This line will compile
    IntFunction<IntUnaryOperator> inFu = x -> y -> x*y;

    IntStream newStream2 = stream.map(inFu.apply(10));//line n2

    newStream2.forEach(System.out::println);

    }

}
