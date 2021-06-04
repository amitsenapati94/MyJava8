package com.bipredicate;

import com.company.Employee2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BiPredicateTest {

    public static void main(String[] args) {

        BiPredicate<Employee2,Employee2> filter2 = (source,target) ->
                source.getAge().equals(target.getAge());

        Predicate<Employee2> filter1 = empployee ->
                empployee.getName().equals("Dave");

        Employee2 employee1 = new Employee2();
        employee1.setName("Dave");
        employee1.setAge(40);

        Employee2 employee2 = new Employee2();
        employee2.setName("John");
        employee2.setAge(30);

        Employee2 employee3 = new Employee2();
        employee3.setName("Tom");
        employee3.setAge(20);

        List<Employee2> sourceList = new ArrayList<Employee2>();
        sourceList.add(employee1);
        sourceList.add(employee2);
        sourceList.add(employee3);

        Employee2 employeeTarget = new Employee2();
        employeeTarget.setName("Dave");
        employeeTarget.setAge(40);

        List<Employee2> finalResult = searchList(sourceList,filter1,filter2,employeeTarget);
        System.out.println(finalResult);

    }

    public static <T, U> List<T> searchList(List<T> list, Predicate<T> filter1, BiPredicate<T, U> filter2, U targetObj){

        return  list.stream()
                .filter(filter1)
                .filter(e -> filter2.test(e,targetObj))
                .collect(Collectors.toList());
    }
}
