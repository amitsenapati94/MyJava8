package com.ocp.practice;

import java.util.*;

public class MapTest1 {

    public static void main(String[] args) {


    List<String> stringList = Arrays.asList("tiger", "lion", "tiger","dog","dog","dog");

    Map<String, Integer> map = new HashMap<>();

        for (String s : stringList){

            if(map.get(s)!=null){
                int count = map.get(s);
                map.put(s,++count);
            }else{
                map.put(s,1);
            }
        }

        Set<String> keys = map.keySet();

        int maxCount = 0;
        for (String key : keys){
            if(map.get(key) > maxCount){
                maxCount = map.get(key);
            }
        }
        System.out.println("maxCount: "+maxCount);


        int count = 0;
        String key = "";
        for( Map.Entry<String,Integer> entry : map.entrySet()) {

            if(entry.getValue() > count){
                count = entry.getValue();
                key = entry.getKey();
            }
        }

        System.out.println("key: "+key);
        System.out.println("count: "+count);

    }

}
