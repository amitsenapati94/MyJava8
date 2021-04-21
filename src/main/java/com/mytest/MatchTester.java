package main.java.com.mytest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


//allMatch will just check as long as it is false
//anyMatch will check for all entries

public class MatchTester {

    public static void main(String[] args) {

        List<String> colors = Arrays.asList("red", "green", "yellow");
        Predicate<String> test = n -> {
            System.out.println("Searching...");
            return n.contains("red");
        };

       /*  boolean allMatch = colors.stream()
                .filter(c -> c.length() > 3)
                .allMatch(test);*/


        boolean anyMatch = colors.stream()
                .filter(c -> c.length() > 3)
                .anyMatch(test);

        //System.out.println("allMatch: "+allMatch);

        System.out.println("anyMatch: "+anyMatch);

    }
}
