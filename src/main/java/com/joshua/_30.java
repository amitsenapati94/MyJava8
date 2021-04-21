package main.java.com.joshua;

import java.util.HashSet;
import java.util.Set;

public class _30 {

    public static void main(String[] args) {

        Set<String> guys= new HashSet<>();
        guys.add("Tom");
        guys.add("Dick");
        Set<String> stooges = new HashSet<>();
        stooges.add("Larry");
        stooges.add("Moe");

        Set<String> aflCio = union(guys, stooges);
        System.out.println(aflCio);
    }

    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    public static <E> Set<E> union2(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
}
