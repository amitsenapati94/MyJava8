package com.venkat;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupInts {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);


       //IntSummaryStatistics stats  = list.stream().mapToInt((x) -> x) .summaryStatistics();

        //System.out.println(stats);
        HashMap<Integer, String> map = list.stream()
                .collect(Collectors.toMap( Function.identity(), String::valueOf, (k1, k2) -> k1, HashMap::new));

        System.out.println(map);


    }
}
