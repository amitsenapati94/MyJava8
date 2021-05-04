package com.modern.part4;

import java.util.Optional;

public class OptionalUtility {

    public static void main(String[] args) {

        Optional<Integer> intOpt = stringToInt(null);

        if(intOpt.isPresent()){
            System.out.println("int value: {}"+ intOpt.get());
        }
    }

    public static Optional<Integer> stringToInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
