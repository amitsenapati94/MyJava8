package main.java.com.ocp.ch3;

public class Hello<T> {
 T t;

 public Hello(T t) {
     this.t = t;
 }
 public String toString() {
     return t.toString();
 }

 public static void main(String[] args) {
      System.out.println(new Hello<String>("hi"));
      System.out.println(new Hello("there"));

      StringBuilder sb = new StringBuilder("bye");
     System.out.println(new Hello<Integer>(10));

 }
}
