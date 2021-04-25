package com.ocp.polymorphism;

public class Oceanographer {

    public void checkSound(LiveOcean liveOcean){
        liveOcean.makeSound();
    }

    public static void main(String[] args) {

        Oceanographer oceanographer = new Oceanographer();
        oceanographer.checkSound(new Dolphine());

    }


}


interface LiveOcean{

    public void makeSound();
}

class Whale implements LiveOcean{

    @Override
    public void makeSound() {
        System.out.println("sing");
    }
}

class Dolphine implements LiveOcean{

    @Override
    public void makeSound() {
        System.out.println("whistle");
    }
}