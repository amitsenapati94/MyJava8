package com.ocp.ch4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumer1 {


    public static void main(String[] args) {

        BiConsumer1 biConsumer1 = new BiConsumer1();
        biConsumer1.addToMap();
    }

    public void addToMap(){

        Map<String, String> map = new HashMap<>();
        BiConsumer<String, String> b1 = map::put;

        String key = "myKey";
        String val = "myVal";

        b1.accept(key,val);

        System.out.println(map);

    }
}
