package com.collection;


import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("Alice", 1);

        //return null if key is not present
        System.out.println(map.get("Jane"));

        //this will add 2 to 1
        map.merge("Alice",2,Integer::sum);

        System.out.println(map.get("Alice"));


    }
}
