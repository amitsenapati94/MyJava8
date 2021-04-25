package com.ocp.ch2;

interface CanHop {}

public class Frog implements CanHop {
    public static void main(String[] args) {
        //Frog frog = new TurtleFrog();
        //TurtleFrog frog = new TurtleFrog();
        //CanHop frog = new TurtleFrog();
        Object frog = new TurtleFrog();

    }
}

class BrazilianHornedFrog extends Frog {}

class TurtleFrog extends Frog {}
