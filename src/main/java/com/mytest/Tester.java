package com.mytest;

import java.util.ArrayList;

public class Tester {


    public static void main(String a[]) {

        //scenario-1
        //ArrayList declared with Interface
        //trying to add the implementation class to the list

        ArrayList<Vehicle> myList = new ArrayList<>();
        myList.add(new Motorcycle());



        //scenario-2
        //ArrayList declared with Superclass
        //trying to add the subclass to the list

        ArrayList<Motor> myList2 = new ArrayList<>();
        myList2.add(new MotorBike());



        //scenario-3
        //in this case both declaration class and adding class extend the same superclass
        //This won't compile
        //add Motor can't be applied to MotorBike

        //ArrayList<Motor> myList3 = new ArrayList<>();
        //myList2.add(new MotorBike());


    }


}

class Motorcycle implements Vehicle {

}


class Motor extends Transportation{


}

class MotorBike extends Motor{

}

class Transportation{

}

