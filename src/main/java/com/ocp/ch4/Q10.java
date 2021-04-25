package com.ocp.ch4;

import java.util.stream.Stream;

public class Q10 {

    public static void main(String[] args) {

      /*  Stream.generate(() -> "1")
        //L:
        .filter(x -> x.length() > 1)
        //M:
        .forEach(System.out::println)
        //N:
        .limit(10)
        //O:
        .peek(System.out::println);*/

        Stream.generate(() -> "1")
                //L:
                .peek(System.out::println)

                .limit(10)
                //.peek(System.out::println)

                .filter(x -> x.length() > 1)

                //.peek(System.out::println)
                //M:
                .forEach(System.out::println);
                //N:

                //O:


    }

    //order
    //LNO
}
