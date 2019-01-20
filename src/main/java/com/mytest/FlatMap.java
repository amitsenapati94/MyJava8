package com.mytest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String args[]){
        List<Integer> list1 = Arrays.asList(10, 20);
        List<Integer> list2 = Arrays.asList(15, 30);

        List<Integer> combineList = Stream.of(list1, list2)
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
                //.forEach(s -> System.out.print(s + " "));

        combineList.forEach(s -> System.out.print(s + " "));




        Stream<List<String>> iStr= Stream.of (
                Arrays.asList ("1", "John"),
                Arrays.asList("2",null));

        //won't compile. Stream<String> can't be converted to IntStream
        //Stream<String> nInSt = iStr.flatMapToInt ((x) -> x.stream());

        //This will work
        Stream<String> nSt = iStr.flatMap((x) -> x.stream());

        nSt.forEach (System.out :: print);






    }
}
