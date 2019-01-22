package com.mytest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PathExample {

    public static void main(String[] args) {

        Path currentDir = Paths.get(".");
        System.out.println(currentDir.toAbsolutePath());

        Stream<Path> paths = Stream.of (Paths.get("data.doc"),
                Paths. get("src/main/java/com/mytest/data.txt"),
                Paths. get("data.xml"));

        paths.filter(s-> s.toString().endsWith("txt")).forEach( s -> {
                    try {
                        Files.readAllLines(s)
                                .stream()
                                .forEach(System.out::println); //line n1
                         } catch (IOException e) {
                        System.out.println("Exception: " + e);
                    }
                }
        );

    }
}
