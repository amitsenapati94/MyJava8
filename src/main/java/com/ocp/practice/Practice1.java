package com.ocp.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice1 {

    public static void main(String[] args) {

        int[] intArray = {1,5,2,3,4,3,3,3,3};

        List<Integer> list = Arrays.stream(intArray).boxed().collect(Collectors.toList());

        //System.out.println(list);

        List<Integer> sortedList = list.stream()
                .sorted(Comparator.comparing(Integer::intValue))
                .collect(Collectors.toList());

        //System.out.println(sortedList);

        //list.sort(Comparator.comparing(Integer::intValue));

        //System.out.println(list);

        //Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));

        //Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<Integer,Long> mapSorted = list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        //Set<Map.Entry<Integer,Long>> set = mapSorted.entrySet();

        System.out.println(mapSorted);


        long count = 0;
        int key = 0;
        for(Map.Entry<Integer,Long> item : mapSorted.entrySet()){

            if(item.getValue() > count){
                count = item.getValue();
                key = item.getKey();
            }
        }


        //System.out.println(key+ ":"+count);



        TreeMap<Integer, List<Integer>> map1 = list.stream()
                .collect(Collectors.groupingBy(Integer::intValue,TreeMap::new,Collectors.toList()));

        System.out.println(map1);

        String[] strArray = {"test","test1","test"};

        List<String> strList = Arrays.asList(strArray);

        Map<String,Long> mapSortedstrArray = strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        //System.out.println(mapSortedstrArray);

    }
}
