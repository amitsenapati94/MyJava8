package main.java.com.ocp;

public class InstanceofTest {

    public static void main(String[] args) {

        class HeavyAnimal { }
        class Hippo extends HeavyAnimal { }
        class Elephant extends HeavyAnimal { }

        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo; // true
        boolean b2 = hippo instanceof HeavyAnimal; // true
        boolean b3 = hippo instanceof Elephant; // false

        Hippo anotherHippo = new Hippo();

        HeavyAnimal heavyAnimal = new HeavyAnimal();

        System.out.println(anotherHippo instanceof  HeavyAnimal);

        System.out.println(heavyAnimal instanceof  Hippo);

    }
}
