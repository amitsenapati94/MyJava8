package com.ocp.compare;

import java.util.Comparator;

public class ChainingComparator implements Comparator<Squirrel> {


    @Override
    public int compare(Squirrel s1, Squirrel s2) {

        Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
        c = c.thenComparing(s -> s.getWeight());
        return c.compare(s1, s2);
    }
}
