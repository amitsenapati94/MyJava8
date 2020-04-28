//https://www.journaldev.com/122/concurrenthashmap-in-java

package com.concurrenthashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapStreamTest {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","1");
        map.put("3","1");
        map.put("4","1");
        map.put("5","1");
        System.out.println("hashmap before interation: "+map);

        Set<Map.Entry<String,String>> entrySet =  map.entrySet();

        entrySet.forEach(e -> {
            if(e.getKey().equals("3")){
                //e.setValue("30"); // this works
                //map.remove("3"); //ConcurrentModificationException
                //map.put("10","10");//ConcurrentModificationException
            }
        });


        System.out.println("hashmap after interation: "+map);


       Map<String,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("1","1");
        concurrentHashMap.put("2","1");
        concurrentHashMap.put("3","1");
        concurrentHashMap.put("4","1");
        concurrentHashMap.put("5","1");
        System.out.println("ConcurrentHashMap before interation: "+concurrentHashMap);


        Set<Map.Entry<String,String>> concurrentEntrySet =  concurrentHashMap.entrySet();

        concurrentEntrySet.forEach(e -> {
            if(e.getKey().equals("3")){
                //e.setValue("30"); // this works
                concurrentHashMap.remove("3"); //this works
                concurrentHashMap.put("10","10");//this works
            }
        });
        System.out.println("ConcurrentHashMap before interation: "+concurrentHashMap);

    }
}
