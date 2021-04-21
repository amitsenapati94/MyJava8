package main.java.com.ocp.immutable;

import java.util.*;

public final class Animal {
    private final String species;
    private final int age;
    private final List<String> favoriteFoods;

    public Animal(String species, int age, List<String> favoriteFoods) {
        this.species = species;
        this.age = age;
        if(favoriteFoods == null) {
        throw new RuntimeException("favoriteFoods is required");
        }

        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }

    public List<String> getFavoriteFoods() { // MAKES CLASS MUTABLE!
return favoriteFoods;
}
}