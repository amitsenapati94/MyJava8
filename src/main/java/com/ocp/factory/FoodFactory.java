package com.ocp.factory;

public class FoodFactory {


    public static Food getFood(String name){

        switch (name) {
            case "cow" :
                return new Hay(5);
            case "goat" :
                return new Hay(2);
        }

        throw new UnsupportedOperationException("Unsupported animal: "+name);
    }
}
