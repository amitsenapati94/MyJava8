package com.finaltest;

import java.util.ArrayList;
import java.util.List;

public class FinalTest {

    public static void main(String[] args) {
        List<String> somelist = new ArrayList<>();
        final List<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("some");
        //list = somelist;
        System.out.println(list.size());
    }
}
