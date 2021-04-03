package com.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTester {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>( );

        map1.put (5, "b");
        map1.put (1, "d");
        map1.put (7, "e");

        for (Map.Entry<Integer, String> entry : map1.entrySet () ) {
            //System.out.print (entry.getKey() + " "+entry.getValue());
            //System.out.println("\n");
        }

        Map<Integer, String> map2 = new LinkedHashMap<>( );
        map2.put (5, "b");
        map2.put (1, "d");
        map2.put (7, "e");

        for (Map.Entry<Integer, String> entry : map2.entrySet () ) {
            //System.out.print (entry.getKey() + " "+entry.getValue());
            //System.out.println("\n");
        }

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap = map1;

        for (Map.Entry<Integer, String> entry : treeMap.entrySet () ) {
            System.out.print (entry.getKey() + " "+entry.getValue());
            System.out.println("\n");
        }


    }
}
