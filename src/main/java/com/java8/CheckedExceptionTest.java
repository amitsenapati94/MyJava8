package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CheckedExceptionTest {

    public static void main(String[] args) {

        CheckedExceptionTest checkedExceptionTest = new CheckedExceptionTest();

        List<String> list = Arrays.asList("test","test1","test3");

        /*boolean eval = list.stream()
                .filter(e -> isRecFound(e))
                .findFirst()
                .isPresent();*/

        boolean eval = false;

        eval = list.stream()
                .map(transform(e -> isRecFound(e)))
                .findFirst()
                .isPresent();

        System.out.println("eval: "+eval);
        //System.out.println("count: "+count);

    }


    private static boolean isRecFound(String input) throws Exception{

        return false;
    }

    public <T, R> List<R> map(List<T> list, Function<T, R> func) {

        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(func.apply(t));
        }
        return result;

    }

    public static <T, R> Function<T, R> transform(ThrowingFunction<T, R> throwingFunction) {
        return param -> {
            try {
                return throwingFunction.apply(param);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        };
    }
}
