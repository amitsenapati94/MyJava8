package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by amitsenapati on 2/20/17.
 */
public class UsingComparator {

    public static void main(String a[])
    {
        UsingComparator uc = new UsingComparator();
        uc.compareEmployee();

    }
    public void compareEmployee()
    {
        Employee2 employee1 = new Employee2();
        employee1.setName("Dave");
        employee1.setAge(40);

        Employee2 employee2 = new Employee2();
        employee2.setName("John");
        employee2.setAge(30);

        Employee2 employee3 = new Employee2();
        employee3.setName("Tom");
        employee3.setAge(20);

        List<Employee2> list = new ArrayList<Employee2>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        Collections.sort(list, new EmployeeAgeComparator());

        System.out.println(list);

    }

}
