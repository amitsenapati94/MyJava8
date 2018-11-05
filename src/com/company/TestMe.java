package com.company;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by amitsenapati on 3/9/16.
 */
public class TestMe {

    public static void main(String[] args) {
        // write your code here

       // System.out.println("hello world");

        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("20"),
                new BigDecimal("30"));

        final BigDecimal finalDiscountedPrice =
        prices.stream()
              .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
              .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
              .reduce(BigDecimal.ZERO, BigDecimal::add);

        //System.out.println("Total Discounted Price :" + finalDiscountedPrice);


        final List<String> listOfFriends = Arrays.asList("Joe","Dave");

        //listOfFriends.forEach(e -> System.out.println(e));

       // listOfFriends.forEach(System.out::println);

        //listOfFriends.stream()
        //             .map(e -> e.toUpperCase())
        //             .forEach(e -> System.out.println(e));


        // using method reference

        //listOfFriends.stream()
        //             .map(String::toUpperCase)
        //             .forEach(System.out::println);

        //final List<String> friendsStartsWithD =

        listOfFriends.stream()
                     .filter(e -> e.startsWith("D"))
                     .collect(Collectors.toList())
                     .forEach(System.out::println);



    }

}
