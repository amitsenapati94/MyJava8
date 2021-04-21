package main.java.com.ocp.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Duck implements Comparable<Duck>{

    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Duck d) {
        return this.name.compareTo(d.name);
    }


    public static void main(String[] args) {
       /* Comparator<Duck> byWeight = new Comparator<Duck>() {
            public int compare(Duck d1, Duck d2) {
                return d1.getWeight() - d2.getWeight();
            }
        };*/
        Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight() - d2.getWeight();

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        Collections.sort(ducks);
        ducks.forEach(e -> System.out.println(e.getName())); // [Puddles, Quack]
        Collections.sort(ducks, byWeight);
        ducks.forEach(System.out::println); // [Quack, Puddles]
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                '}';
    }
}
