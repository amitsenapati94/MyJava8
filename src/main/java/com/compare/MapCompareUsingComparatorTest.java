package com.compare;

import com.company.Employee2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapCompareUsingComparatorTest {

    public static void main(String[] args) {
        Employee2 employee1 = new Employee2();
        employee1.setName("Dave");
        employee1.setAge(10);

        Employee2 employee2 = new Employee2();
        employee2.setName("John");
        employee2.setAge(30);

        Employee2 employee3 = new Employee2();
        employee3.setName("Tom");
        employee3.setAge(20);

        Map<String,Employee2> employee2Map = new HashMap<>();

        employee2Map.put("Dave",employee1);
        employee2Map.put("John",employee2);
        employee2Map.put("Tom",employee3);


    }
}
