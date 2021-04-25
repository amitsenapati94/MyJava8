package com.venkat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class uniQueList {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("abc","def","abc");

        final List<String> uniqueList
                = list.stream()
                       .filter(e -> !list.contains(e))
                        .collect(Collectors.toList());

        System.out.println(uniqueList);

    }
}
