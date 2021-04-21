package main.java.com.defaultmethods;

public interface FastFly extends Fly {

    default void takeOff(){
        System.out.println(" FastFly:: takeOff");
    }
}
