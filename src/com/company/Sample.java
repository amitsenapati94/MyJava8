package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by amitsenapati on 8/14/16.
 */
public class Sample {

    public static void main(String a[]){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);




        System.out.println(
                numbers.stream()
                    .filter(Sample::isGT3)
                    .findFirst()
                .get()
        );

        List<String> numberList = Arrays.asList("11","5","6");

        List<Integer> sortedList = numbers.stream().collect(Collectors.toList());

        for (Integer s : sortedList)
        {
            System.out.println(s);
        }
    }

    public static boolean isGT3(int number)
    {
        return number > 3;
    }
}
