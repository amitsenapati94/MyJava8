package main.java.com.defaultmethods;

public class SeaPlane extends Vehicle implements FastFly, Sail{


 /*   @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }*/

    @Override
    public void cruise() {
        System.out.println("SeaPlane::cruise");

    }
}
