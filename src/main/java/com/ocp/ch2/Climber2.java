package com.ocp.ch2;


public class Climber2 {
    public static void main(String[] args) {
        check((h, l) -> h > l,10); // x1
    }

    private static void check(Climb climb, int limit) {

        if (climb.isTooHigh(30, limit)) // x2
            System.out.println("too high");
        else System.out.println("ok");
    } }
