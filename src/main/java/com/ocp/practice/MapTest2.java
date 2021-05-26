package com.ocp.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {


        List<String> stringList = Arrays.asList("tiger", "lion", "tiger", "dog", "dog", "dog");

        Map<String, Integer> map = new HashMap<>();

        int maxCount = 0;
        String maxKey = null;

        for (String s : stringList) {

            if (map.get(s) != null) {
                int count = map.get(s);
                map.put(s, ++count);

                if(count > maxCount){
                    maxCount= count;
                    maxKey = s;
                }
            } else {
                map.put(s, 1);
            }
        }

        System.out.println("maxKey: "+maxKey);
        System.out.println("maxCount: "+maxCount);

    }
}
