package main.java.com.mytest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html

public class Country {

    public enum Continent {ASIA, EUROPE, NA}

    String name;
    Continent region;

    public Country (String na, Continent reg) {
        name = na;
        region = reg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getRegion() {
        return region;
    }

    public void setRegion(Continent region) {
        this.region = region;
    }

    public static void main(String[] args) {


        List<Country> couList = Arrays.asList (
                new Country ("Japan", Country.Continent.ASIA),
                new Country ("USA", Country.Continent.NA),
                new Country ("Italy", Country.Continent.EUROPE),
                new Country ("Germany", Country.Continent.EUROPE));

        Map<Continent, List<String>> regionNames =
                couList.stream ()
                        .collect(Collectors.groupingBy(Country::getRegion, Collectors.mapping(Country::getName, Collectors.toList())));

        System.out.println(regionNames);
    }
}
