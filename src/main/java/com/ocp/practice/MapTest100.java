package com.ocp.practice;

import com.ocp.OrderLnAddInfo;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MapTest100 {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("tiger","lion","tiger");

        Map<String,Long> stringmapCount = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("stringmapCount: "+stringmapCount);


        List<Integer> intList = Arrays.asList(1,2,3,4,4,2,2,5);

        Map<Integer,Long> mapCount = intList.stream()
                .collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
        System.out.println("mapCount: "+mapCount);

        Supplier<OrderLnAddInfo> orderSupplier = OrderLnAddInfo::new;

        OrderLnAddInfo ord1 = orderSupplier.get();
        ord1.setColName("1");
        ord1.setColValue("val1");

        System.out.println(ord1);

        OrderLnAddInfo ord2 = orderSupplier.get();
        ord2.setColName("2");
        ord2.setColValue("val2");

        OrderLnAddInfo ord3 = orderSupplier.get();
        ord3.setColName("3");
        ord3.setColValue("val3");

        OrderLnAddInfo ord4 = orderSupplier.get();
        ord4.setColName("4");
        ord4.setColValue("val4");

        OrderLnAddInfo ord5 = orderSupplier.get();
        ord5.setColName("4");
        ord5.setColValue("val5");

        List<OrderLnAddInfo> orderLnAddInfoList = new ArrayList<>();

        orderLnAddInfoList.add(ord1);
        orderLnAddInfoList.add(ord5);
        orderLnAddInfoList.add(ord2);
        orderLnAddInfoList.add(ord3);
        orderLnAddInfoList.add(ord4);

        System.out.println(orderLnAddInfoList);

        //Duplicate key val4
   /*     Map<String,String> map = orderLnAddInfoList.stream()
                .collect(Collectors.toMap(OrderLnAddInfo::getColName,OrderLnAddInfo::getColValue));*/

        //System.out.println(map);
        //Map<Integer, Long> map2 = nos.collect(Collectors.groupingBy(
                //Integer::intValue, Collectors.counting()));
        Map<String, List<OrderLnAddInfo>> map2 = orderLnAddInfoList.stream()
                .collect(Collectors.groupingBy(OrderLnAddInfo::getColName));
        System.out.println(map2);

        //groupby count
        Map<String, Long> map3 = orderLnAddInfoList.stream()
                .collect(Collectors.groupingBy(OrderLnAddInfo::getColName,Collectors.counting()));

        System.out.println("map3: "+map3);

       Long count =  orderLnAddInfoList.stream()
                .collect(Collectors.counting());

        System.out.println(count);
        System.out.println("map size:" + map2.size());


       List<OrderLnAddInfo> sortedList = orderLnAddInfoList.stream()
                .sorted(Comparator.comparing(OrderLnAddInfo::getColName))
                .collect(Collectors.toList());

        System.out.println("sortedList: "+sortedList);

        List<OrderLnAddInfo> sortedListReverse = orderLnAddInfoList.stream()
                .sorted(Comparator.comparing(OrderLnAddInfo::getColName).reversed())
                .collect(Collectors.toList());

        System.out.println("sortedListReverse: "+sortedListReverse);

        List<OrderLnAddInfo> sortedListMulti = orderLnAddInfoList.stream()
                .sorted(Comparator.comparing(OrderLnAddInfo::getColName).thenComparing(OrderLnAddInfo::getColValue))
                .collect(Collectors.toList());

        System.out.println("sortedListMulti: "+sortedListMulti);


        //orderLnAddInfoList.sort();


    }
}
