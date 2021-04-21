package main.java.com.mytest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

    //ISO_DATE_TIME Date and time with ZoneId

    public static void main(String a[]){

        String toParse = "2011-12-03T10:15:30";

        String date = LocalDate
                .parse(toParse)
                .format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(date);

    }
}
