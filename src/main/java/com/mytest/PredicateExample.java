package main.java.com.mytest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        List<String> str = Arrays.asList ("my", "pen", "is", "your", "pen");


        //predicate code is executing for every elements.
        //int i is initializing to 0 with each iterations
        //it loops through twice until result is true.

        Predicate<String> test = s -> {
            int i = 0;
            boolean result = s.contains ("pen");
            System.out.print(i++ + ":");
            return result;
        };

        str.stream()
                .filter(test)
                .findFirst()
                .ifPresent(System.out::print);
    }

}
