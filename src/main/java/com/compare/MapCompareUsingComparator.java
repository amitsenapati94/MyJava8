package main.java.com.compare;

import main.java.com.company.Employee2;
import main.java.com.company.EmployeeAgeComparator;

import java.util.*;
import java.util.stream.Collectors;

public class MapCompareUsingComparator {

    public static void main(String[] args) {

       // SortedMap<Integer,String> map1 = new SortedMap<Integer, String>();


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

        Map<String,Employee2> sortedMapByValue = employee2Map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(new EmployeeAgeComparator()))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        sortedMapByValue.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));


        /*Map<String, Integer> sortedMapByValue = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));*/
    }
}
