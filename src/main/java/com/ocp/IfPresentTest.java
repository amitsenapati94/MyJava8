package main.java.com.ocp;

import java.util.Arrays;
import java.util.List;

public class IfPresentTest {

    String found;


    public static void main(String[] args) {


        IfPresentTest ifPresentTest = new IfPresentTest();
        ifPresentTest.ifPresentMethod();
        ifPresentTest.ifPresentMethod2();

    }

    void ifPresentMethod(){
        List<String> list = Arrays.asList("test1","test2");

        list.stream()
                .filter(s -> s.equals("test2"))
                .findFirst()
                .ifPresent(f -> found="found");

        System.out.println("found: "+found);

    }

    void ifPresentMethod2(){
        List<String> list = Arrays.asList("test1","test2");

        list.stream()
                .filter(s -> s.equals("test3"))
                .findFirst()
                .ifPresent(f -> found="found");

        System.out.println("found: "+found);

    }
}
