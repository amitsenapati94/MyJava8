package main.java.com.ocp;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class BinaryOperatorTest {

    public static void main(String[] args) {

        BinaryOperator<String> b2 = String::concat;

        List<String> list = Arrays.asList("home","mobile","fax","office", "other");

        //list.stream().map(b2.apply(e,"test")).collect(Collectors.toList());

        System.out.println(list);


    }
}
