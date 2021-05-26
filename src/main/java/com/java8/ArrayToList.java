package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToList {

    public static void main(String[] args) {

        Integer[] inputObj = {1,2,3};
        int[] input = {1,2,3};

        List<Integer> outputObj = Arrays.asList(inputObj);

        List<Integer> output = Arrays.stream(input).boxed().collect(Collectors.toList());
       // List<Integer> output = IntStream.of(input).boxed().collect(Collectors.toList());

        System.out.println(outputObj);

        System.out.println(output);
    }
}
