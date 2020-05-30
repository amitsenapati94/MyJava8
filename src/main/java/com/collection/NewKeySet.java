package com.collection;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class NewKeySet {

    public static void main(String[] args) {

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentHashMap.KeySetView<Object, Boolean> objects = concurrentHashMap.newKeySet();

        objects.add("1");
        objects.add("2");
        objects.add("3");
        objects.add("4");

        System.out.println(objects);

        final Iterator<Object> itr = objects.iterator();

        //adding element after creating iterator
        objects.add("5");

        while(itr.hasNext()){
            //System.out.println(itr.next());
            if(itr.next().equals("2")){
                itr.remove();
            }
        }

        System.out.println(objects);
    }
}
