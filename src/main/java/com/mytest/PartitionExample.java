package com.mytest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionExample {

    private static final int PASS_THRESHOLD = 50;

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("john");
        s1.setGrade(60);

        Student s2 = new Student();
        s2.setName("mike");
        s2.setGrade(40);

        Student s3 = new Student();
        s3.setName("Tom");
        s3.setGrade(90);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);


        Map<Boolean,List<Student>> passFailMap =
        list.stream()
            .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));

        Map<Boolean,List<Student>> passFailMapGroupBy =
                list.stream()
                        .collect(Collectors.groupingBy(s -> s.getGrade() >= PASS_THRESHOLD));

       // Map<Integer,Student> passFailMapGroupByWithReducing =
         //       list.stream()
           //             .collect(Collectors.groupingBy(Student::getGrade));


        passFailMap.size();
        passFailMapGroupBy.size();
    }


    static class Student{
        private String name;
        private int grade;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }
    }
}
