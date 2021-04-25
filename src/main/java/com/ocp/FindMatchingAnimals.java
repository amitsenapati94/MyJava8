package com.ocp;

public class FindMatchingAnimals {

   /* private static void print(Animal animal, Predicate<Animal> trait) {
        if(trait.test(animal))
            System.out.println(animal);
    }*/

    private static void print(Animal animal, CheckTrait trait) {

        if(trait.check(animal)) {
            System.out.println(animal);
        }
    }

public static void main(String[] args) {

//print(new Animal("fish", false, true), b -> b.canHop());
//print(new Animal("kangaroo", true, false), (Animal a) -> a.canHop());
print(new Animal("dolphine", false, true), (Animal a) -> a.canSwim());

    }
}