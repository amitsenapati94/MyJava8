package main.java.com.ocp.ch4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q20 {

    public static void main(String[] args) {
        List<Integer> l = IntStream.range(1, 6)
                .mapToObj(i -> i).collect(Collectors.toList());
        l.forEach(System.out::println);
    }
}
