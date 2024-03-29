package com.ocp;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierEx {

    public static void main(String[] args) {

        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(LocalDate.now());


        Supplier<StringBuilder> sb1 = StringBuilder::new;
        System.out.println(sb1.get().append("hello"));
    }
}
