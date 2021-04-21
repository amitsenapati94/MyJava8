package main.java.com.ocp;

import java.util.*;
import java.util.stream.Collectors;

public class ListStream1 {

    public static void main(String[] args) {

        //List<String> list = Arrays.asList("123");

        //List<String> list = new ArrayList<>();
        List<String> list = null;


        List<String> finalList = Optional.ofNullable(list)
                .orElseGet(Collections::emptyList)
                .stream().filter(Objects::nonNull)
                .filter(listElement -> listElement.equals("candy"))
                .collect(Collectors.toList());

        System.out.println(finalList);

        System.out.println(finalList.stream().count());

    }
}
