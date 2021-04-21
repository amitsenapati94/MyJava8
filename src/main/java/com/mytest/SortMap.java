package main.java.com.mytest;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("smith",15);
        map.put("amit",10);
        map.put("john",20);

        Map<String, Integer> sortedMapByValue = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));




        sortedMapByValue.entrySet().forEach(e -> System.out.println(e.getKey() +" " + e.getValue()));


        Map<String,Integer> sortedMapByKey = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue,newValue) -> oldValue,LinkedHashMap::new));


        sortedMapByKey.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        //map.forEach((k, v) -> System.out.println(k + ":" + v));


    }
}
