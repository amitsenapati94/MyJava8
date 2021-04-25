package com.company;
import java.util.*;
/**
 * Created by amitsenapati on 8/26/17.
 */
public class HashMapTest {

    public static void main(String a[])
    {
        /* Map<String,String> map = new HashMap<String,String>();

        map.put("abc", "hi");
        map.put("xyz", "bye");
        map.put("horsemints", "test");
        map.put("misused", "test2");
        map.put("abc", "hello");


        System.out.println("horsemints".hashCode());
        System.out.println("misused".hashCode());


        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }*/

        /*Set<String> set = new HashSet<String>();
        set.add("horsemints");
        set.add("misused");

        for(String s : set)
        {
            System.out.println(s + " ");
        }*/

        /*Set<String> set2 = new LinkedHashSet<String>();
        set2.add("horsemints");
        set2.add("misused");

        for(String s : set2)
        {
            System.out.println(s + " ");
        }
*/

        Map<String,String> map = new HashMap<String,String>();

        map.put("1", "hi");
        map.put("1", "bye");



        System.out.println(map.get("1"));
    }
}
