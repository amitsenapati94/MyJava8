package main.java.com.mytest;


//super class sub class constructor invoke

public class Car extends Vehicle2{

    String trans;

    Car(String trans){
        this.trans = trans;
    }


    //super or this has to first statement
    Car(String type,int maxSpeed, String trans){
        //super(type,maxSpeed);
        this(trans);

    }

    public static void main(String a[]) {
        Car c1 = new Car("Auto");
        System.out.println(c1.type+" "+c1.maxSpeed+" "+c1.trans);

        Car c2 = new Car("4w",150,"Manual");
        System.out.println(c2.type+" "+c2.maxSpeed+" "+c2.trans);

    }


}

class Vehicle2{

    String type = "4w";
    int maxSpeed = 100;

    Vehicle2(String type, int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;
    }

    //should have default constructor, otherwise it won't compile
   public Vehicle2() {

    }
}
