package com.mytest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Emp {
    String fName;
    String lName;

    public Emp (String fn, String ln) {
    fName = fn;
    lName = ln;
}

    public String getfName() {
            return fName;
        }

    public String getlName() {
        return lName;
    }

    public static void main(String args[])
    {
        List<Emp> emp = Arrays.asList(
                new Emp("John","Smith"),
                new Emp("Zeter","Sam"),
                new Emp("Thomas","Bale"),
                new Emp("Thomas","Wale"));


        List<Emp> empSorted = emp.stream()
           .sorted(Comparator.comparing(Emp::getfName)
           .reversed()
           .thenComparing(Emp::getlName))
           .collect(Collectors.toList());

        empSorted.forEach(e -> System.out.println(e.getfName()+" "+e.getlName()));
    }

}