package main.java.com.modern.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleFilter {

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

        Apple apple5 = new Apple();
        apple5.setName("granny smith");
        apple5.setColor("GREEN");
        apple5.setWeight(6);

        List<Apple> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        apples.add(apple4);
        apples.add(apple5);


        //List<Apple> appleList = filterApples(apples, Apple::isGreenApple);
        //List<Apple> appleList = filterApples(apples, (Apple a) -> "GREEN".equals(a.getColor()) );
        List<Apple> appleList = filterApples(apples, a -> "GREEN".equals(a.getColor()));
        appleList.forEach(System.out::println);
    }



    static List<Apple> filterApples(List<Apple> inventory,
                                    Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory){
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}

