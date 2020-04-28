package com.mytest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {

        GroupingByExample groupingByExample = new GroupingByExample();
        groupingByExample.groupBy();
    }

    public void groupBy(){
        List<Student> stds = Arrays.asList(

                new Student("Jessy","Java ME","Chicago"),
                new Student("Helen","Java EE","Houston"),
                new Student("Mark","Java ME","Chicago"));

        Map<String, List<Student>> map = stds.stream()
            .collect(Collectors.groupingBy(Student::getCourse));
            //.forEach(s,t ->System.out.println(s));

        //map.forEach((s, studentList) -> System.out.println(s));

        System.out.println(map);

        /*map.forEach(( k,v) -> {
            System.out.println(k);
            System.out.println(v);
        });
*/


    }


    class Student {
        String course, name, city;

        public Student(String name, String course, String city) {
            this.course = course;
            this.name = name;
            this.city = city;
        }


        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String toString() {
            return course + ":" + name + ":" + city; }

    }

}
