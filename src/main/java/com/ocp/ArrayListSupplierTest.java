package com.ocp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ArrayListSupplierTest {

    public static void main(String[] args) {

        Supplier<ArrayList<String>> s1 = ArrayList<String>::new;

        ArrayList<String> a1 = s1.get();
        a1.add("abc");
        System.out.println(a1);

        ArrayList<String> a2 = s1.get();
        a2.add("xyz");
        System.out.println(a2);


        Supplier<OrderLnAddInfo> orderSupplier = OrderLnAddInfo::new;

        OrderLnAddInfo ord1 = orderSupplier.get();
        ord1.setColName("1");
        ord1.setColValue("val1");

        System.out.println(ord1);

        OrderLnAddInfo ord2 = orderSupplier.get();
        ord2.setColName("2");
        ord2.setColValue("val2");

        System.out.println(ord2);

        List<String> stringList = Arrays.asList("1","2");

        BiConsumer<OrderLnAddInfo, String> b1 = (ord, colName) -> ord.setColName(colName);
        BiConsumer<OrderLnAddInfo, String> b2 = (ord, colValue) -> ord.setColValue(colValue);

        OrderLnAddInfo ord3 = orderSupplier.get();

        //b1.accept(ord3, "3");
        //b2.accept(ord3, "val3");

        //System.out.println(ord3.getColName()+":"+ord3.getColValue());

        //stringList.stream().map()
         stringList.stream().forEach(s -> b1.accept(ord3, s));
        System.out.println(ord3.getColName()+":"+ord3.getColValue());

        //final List<Object> collect = stringList.stream().collect(b1);

    }
}
