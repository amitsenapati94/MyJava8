package main.java.com.ocp.factory;

public class ZooKeeper {

    public static void main(String[] args) {

        Food food = FoodFactory.getFood("goat");
        food.consumed();

    }
}
