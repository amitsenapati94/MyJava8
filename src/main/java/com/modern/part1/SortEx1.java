package com.modern.part1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class SortEx1 {

    public static void main(String[] args) {

        Apple apple1 = new Apple();
        apple1.setName("envy");
        apple1.setWeight(5);

        Apple apple2 = new Apple();
        apple2.setName("fuji");
        apple2.setWeight(2);

        Apple apple3 = new Apple();
        apple3.setName("gala");
        apple3.setWeight(4);

        Apple apple4 = new Apple();
        apple4.setName("zoom");
        apple4.setWeight(4);

        List<Apple> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        apples.add(apple4);

        //apples.sort(Comparator.comparing(Apple::getWeight));

        //apples.sort(Comparator.comparing(Apple::getWeight).reversed());

        apples.sort(Comparator.comparing(Apple::getWeight).thenComparing(Apple::getName));

        //apples.forEach(apple -> System.out.println(apple.getName()));

        apples.forEach(System.out::println);


    }

}



