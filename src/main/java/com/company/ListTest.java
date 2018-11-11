package com.company;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.*;

/**
 * Created by amitsenapati on 8/10/17.
 */
public class ListTest {

    public static void main(String a1[])
    {
        List<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();

        //list.add(6);

        while(iterator.hasNext())
        {
            Integer i = iterator.next();
            iterator.remove();
            System.out.println(iterator.next());
        }


       /* CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<Integer>();
        cowList.add(4);
        cowList.add(2);
        Iterator<Integer> it = cowList.iterator();
        cowList.add(6);
        while(it.hasNext()) {
            //it.remove();
            System.out.println(it.next() + " ");
        }*/

    }

}
