package com.mytest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TechName {

    String techName;
    TechName (String techName) {
        this.techName=techName;
    }

    public static void main(String[] args) {

        //scenario-1
        List<TechName> tech = Arrays.asList (
                new TechName("Java-"),
                new TechName("Oracle DB-"),
                new TechName("J2EE-")
        );

        Stream<TechName> stre = tech.stream();

        //stre.map(a -> a.techName).forEach(System.out::print);



        //scenario-2
        List<String> codes = Arrays.asList ("DOC", "MPEG", "JPEG");
        //codes.forEach (c -> System.out.print(c + " "));

        String fmt = codes.stream()
                          .filter(s -> s.contains("PEG"))
                          .reduce((s,t) -> s + t)
                          .get();

        System.out.println("\n" + fmt);

    }
}
