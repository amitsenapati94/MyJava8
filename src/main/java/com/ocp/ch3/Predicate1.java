package com.ocp.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate1 {

    public static void main(String[] args) {

        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();

        List<String> listOfStrings = Arrays.asList("test1","","test2");

        List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);

        System.out.println(nonEmpty);

        Predicate<List<String>> predicate = (List<String> list) -> !list.isEmpty();

        nonEmpty.stream().filter(nonEmptyStringPredicate).collect(Collectors.toList());
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for(T s: list){
            if(p.test(s)){
                results.add(s);
            }
        }
        return results;
    }
}
