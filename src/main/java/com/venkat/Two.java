package com.venkat;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

//page 19
public class Two {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        friends.forEach(new Consumer<String>() {
            public void accept(final String name) {
                System.out.println(name);
            }
        });
        friends.forEach((final String name) -> System.out.println(name));

        friends.forEach(name -> System.out.println(name));


        friends.forEach(System.out::println);

        /*friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println(name));*/


        friends.stream() .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name+"\n"));


    }
}
