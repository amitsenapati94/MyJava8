package com.company;

import java.util.Comparator;

/**
 * Created by amitsenapati on 2/20/17.
 */
public class EmployeeAgeComparator implements Comparator<Employee2> {


    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        //return o1.getAge().compareTo(o2.getAge());
        return o2.getAge().compareTo(o1.getAge());
    }
}
