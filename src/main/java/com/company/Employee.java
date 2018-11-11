package com.company;

/**
 * Created by amitsenapati on 2/20/17.
 */
public class Employee implements Comparable<Employee>{

    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        //return o.getAge() - this.getAge();
        return this.getAge() - o.getAge();
    }

    public String toString() {
        return String.format("(%s, %d)", name, age);
    }
}
