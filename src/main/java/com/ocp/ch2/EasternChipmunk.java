package main.java.com.ocp.ch2;


 interface CanClimb {
 public abstract void climb();
 }
 interface CanClimbTrees extends CanClimb {}

 abstract class Chipmunk implements CanClimbTrees {
 public abstract void chew();
 }


public class EasternChipmunk extends Chipmunk {
    @Override
    public void climb() {

    }

    @Override
    public void chew() {

    }
}
