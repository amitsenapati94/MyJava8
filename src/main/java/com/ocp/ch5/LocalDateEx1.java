package com.ocp.ch5;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class LocalDateEx1 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2021, 1, 1);

        date = date.plusMonths(1);

        String dateStr = date.toString();

        System.out.println(dateStr);

        //String str = date.getYear() + date.getMonthValue() + date.getDayOfMonth();

        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.MARCH, 30);

        Period period = Period.between(start, end);
        System.out.println(period);

        System.out.println(period.getDays());

        System.out.println(start.isBefore(end));


    }
}
