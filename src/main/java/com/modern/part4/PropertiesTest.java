package com.modern.part4;

import java.util.Optional;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) {

        Properties props = new Properties();
        props.setProperty("a", "5");
        props.setProperty("b", "true");
        props.setProperty("c", "-3");

        System.out.println(readDuration(props,"z"));
    }

    public static int readDuration(Properties props, String name) {
        return Optional.ofNullable(props.getProperty(name))
                .flatMap(OptionalUtility::stringToInt)
                .filter(i -> i > 0)
                .orElse(0);
    }
}
