package com.ocp.ch3;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsent {

    private static Map<String,String> cache = new HashMap<>();

    public static void main(String[] args) {

        ComputeIfAbsent computeIfAbsent = new ComputeIfAbsent();
        String data = computeIfAbsent.getData2("google");
        System.out.println(data);

    }

    /*public static String getData(String url){

        String data = cache.get(url);

        if(data == null){
            data = "some data";
            cache.put(url,data);
        }
        return data;
    }*/

    public String getData(String url){
        return "data1";
    }

    public String getData2(String url){
        return cache.computeIfAbsent(url, this::getData);
    }
}
