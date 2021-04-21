package main.java.com.mytest;

/**
 * Created by amitsenapati on 11/30/16.
 */
public class TestInterface implements Inter1, Inter2 {


    @Override
    public void m1() {
        System.out.println("hi");
    }

    public static void main (String a[])
    {
        TestInterface test = new TestInterface();
        test.m1();

        Inter1 inter1 = new TestInterface();
        inter1.m1();
    }
}
