package main.java.com.mytest;

import java.util.stream.IntStream;



public class PeekExample {

    //same stream can't be operated on twice.
    //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed

    public static void main(String[] args) {
        // Creating a stream of integers
        IntStream stream = IntStream.range(2, 10);

        // performing action sum on elements of
        // given range and storing the result in sum
        //int sum = stream.peek(System.out::println).sum();

        // Displaying the result of action performed
        //System.out.println("sum is : " + sum);

        // performing action count on elements of
        // given range and storing the result in Count
        long count = stream.peek(System.out::println).count();

        // Displaying the result of action performed
        System.out.println("count : " + count);
    }
}
