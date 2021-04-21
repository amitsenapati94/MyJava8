package main.java.com.ocp.ch4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q7 {

    public static void main(String[] args) {



        /*return list.stream()
                .compare((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());*/


    }

    private static List<String> extracted(List<String> list) {

        //List<String> list = new ArrayList<>();

        return list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());


        /*return list.stream()
                .compare((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());*/

    }

    private static List<String> sort(List<String> list) {
        List<String> copy = new ArrayList<>(list);
        Collections.sort(copy, (a, b) -> b.compareTo(a));
        return copy;
    }
}


/*
A. return list.stream()
.compare((a, b) -> b.compareTo(a))
.collect(Collectors.toList());

B. return list.stream()
.compare((a, b) -> b.compareTo(a))
.sort();

C. return list.stream()
.compareTo((a, b) -> b.compareTo(a))
.collect(Collectors.toList());

D. return list.stream()
.compareTo((a, b) -> b.compareTo(a))
.sort();

E. return list.stream()
.sorted((a, b) -> b.compareTo(a))
.collect();

F. return list.stream()
.sorted((a, b) -> b.compareTo(a))
.collect(Collectors.toList());
 */