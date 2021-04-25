package com.company;

import java.util.Arrays;
import java.util.*;

/**
 * Created by amitsenapati on 2/20/17.
 */
public class ListSorting {


    public static void main(String a[])
    {
        List<String> list = Arrays.asList("test", "amit", "dave", "dave", "joe", "dave", "test");

        list.stream()
                .filter(x -> x.equals(""))
                .findFirst();


        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : list)
        {
            Integer count = map.get(s);
            map.put(s, count == null ? 1 : ++count);
        }

      for( Map.Entry<String,Integer> entry : map.entrySet()) {
          //System.out.println(entry.getKey() + ":" + entry.getValue());
      }

        Set<Map.Entry<String, Integer>> set = map.entrySet();

       List<Map.Entry<String, Integer>> list1 = new ArrayList<Map.Entry<String, Integer>>(set);

        Collections.sort(list1, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        });

        for(Map.Entry<String, Integer> entry : list1)
        {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }

    static class ValueComparator implements Comparator<Integer>
    {
        @Override
        public int compare(Integer o1, Integer o2) {
            return 0;
        }
    }
}
