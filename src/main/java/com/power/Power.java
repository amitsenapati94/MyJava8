package main.java.com.power;

public class Power {

    public static void main(String args[]){

        int i = 64;

        while (i%2==0)
        {
            i/=2;
        }

        if(i==1)
        {
            System.out.println("i is power of 2");
        }

    }
}
