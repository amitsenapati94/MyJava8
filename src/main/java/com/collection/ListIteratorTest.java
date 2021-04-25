package com.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class ListIteratorTest {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        //list.add("Fred");
        //list.add("wilma");

        ListIterator<String> itr = list.listIterator();
        //Iterator<String> itr = list.iterator();

        itr.add("Fred");
        itr.add("wilma");
        //System.out.println(itr.previous());
        //System.out.println(itr.next());

        /*while(itr.hasNext()){
            System.out.println(itr.next());
        }*/

        System.out.println(list.size());

    }

    public static class TreeSetTest {

        public static void main(String[] args) {

            TreeSet<String> countries = new TreeSet<>();

           /* TreeSet<String> contries = new TreeSet<>((u, v) ->
                    //u.equals(v)) ? 0
                    //: u.equals("USA") ? -1
                    : u.compareTo(v));*/


            countries.add("India");
            countries.add("USA");
            countries.add("Africa");

            countries.forEach(e  -> System.out.println(e));


        }
    }
}
