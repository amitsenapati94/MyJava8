package main.java.com.company;

import java.util.*;

public class SortList {

    public static void main(String a[]){

        //https://reversecoding.net/java-8-comparator-how-to-sort-a-list/

        List<Integer> numbers = Arrays.asList(6, 2, 1, 4, 9);
        System.out.println(numbers);

        numbers.sort(Comparator.reverseOrder());

        //System.out.println(numbers);

        List<String> numbersAsString = Arrays.asList("6", "2", "1", "4", "9");


        List<Movie> movies = Arrays.asList(
                new Movie("Lord of the rings", 8.8, true),
                new Movie("Back to the future", 8.5, false),
                new Movie("Carlito's way", 7.9, true),
                new Movie("Pulp fiction", 8.9, false));

        movies.sort(Comparator.comparing(Movie::isStarred)
                .reversed()
                .thenComparing(Comparator.comparing(Movie::getRating)
                        .reversed())
        );

        movies.forEach(System.out::println);




    }
}
