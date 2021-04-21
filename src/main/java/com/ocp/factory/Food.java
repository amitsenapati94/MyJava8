package main.java.com.ocp.factory;

public abstract class Food {

    int qty;

    public Food(int qty){
        this.qty=qty;
    }

    public int getQuantity(){
        return qty;
    }

    public abstract void consumed();
}

class Hay extends Food{

    public Hay(int qty) {
        super(qty);
    }

    @Override
    public void consumed() {
        System.out.println("Hay eaten: "+getQuantity());
    }
}
