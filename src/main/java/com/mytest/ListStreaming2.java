package com.mytest;

import java.util.ArrayList;
import java.util.List;

public class ListStreaming2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.stream().filter(e -> e.equals(2)).findFirst();


    }
}
