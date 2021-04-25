package com.ocp;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupBy {

    public static void main(String[] args) {

        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
       /* Map<String, Long> map = ohMy.collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));

        System.out.println(map);
*/

        Map<Integer, String> map3 = ohMy.collect(Collectors.toMap(
                String::length, k -> k, (s1, s2) -> s1 + "," + s2));

        //System.out.println(map3);

        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map4 = ohMy2.collect(
                Collectors.groupingBy(String::length));
        System.out.println(map4);




        Stream<Integer> nos = Stream.of(1, 2, 3,5,3,4,4,4);

//        Map<Integer, List<Integer>> map2 = nos.collect(
//                Collectors.groupingBy(Integer::intValue),
//                Collectors.counting());

        Map<Integer, Long> map2 = nos.collect(Collectors.groupingBy(
                Integer::intValue, Collectors.counting()));

        System.out.println(map2);


    }
}
