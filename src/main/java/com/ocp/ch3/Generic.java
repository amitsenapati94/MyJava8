package com.ocp.ch3;

public class Generic {

    public static void main(String[] args) {

        Elephant elephant = new Elephant();

        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.emptyCrate();
    }
}


class Crate<T> {
    private T contents;
    public T emptyCrate() {
        return contents;
    }
    public void packCrate(T contents) {
        this.contents = contents;
    }
}

class Elephant{

}
