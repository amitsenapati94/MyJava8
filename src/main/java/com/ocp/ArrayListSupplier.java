package com.ocp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ArrayListSupplier<T> {

    public static void main(String[] args) {

        ArrayListSupplier<String> obj = new ArrayListSupplier();

        List<String> list = obj.supplier().get();

        System.out.println(list);

    }

    public Supplier<List<T>> supplier() {

        // lambda
        // return () -> new ArrayList<>();

        // constructor reference
        return ArrayList::new;

    }

}