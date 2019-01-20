package com.mytest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        UnaryOperator<Integer> uo1 = s -> s*2;//line n1
        Predicate<Integer> p01 = lv -> lv >= 1500;

        //apply(Integer) can't be applied to Double
        //List<Double> loanValues = Arrays.asList(1000.0, 2000.0);

        List<Integer> loanValues = Arrays.asList(1000, 2000, 5000);


        loanValues.stream()
                .filter(lv -> lv >= 1500)
                .map(lv -> uo1.apply(lv))
                .forEach(s -> System.out.print(s + " "));
    }
}
