package com.company;

import java.util.*;

/**
 * Created by amitsenapati on 2/20/17.
 */
public class UsingComparable {

public static void main(String a[])
{
    UsingComparable uc = new UsingComparable();
    uc.compareEmployee();

}
    public void compareEmployee()
    {
        Employee employee1 = new Employee();
        employee1.setName("Dave");
        employee1.setAge(40);

        Employee employee2 = new Employee();
        employee2.setName("John");
        employee2.setAge(30);

        Employee employee3 = new Employee();
        employee3.setName("Tom");
        employee3.setAge(20);

        List<Employee> list = new ArrayList<Employee>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        Collections.sort(list);

        System.out.println(list);

    }

}
