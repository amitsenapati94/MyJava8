package main.java.com.fibonacci;

/*

this program runs 2 threads
one thread does the fibonacci computation as a continuous process
other thread looks up the computed value after certain time

 */

public class Fibonacci {

    public static volatile int computedValue;

    public static void main(String a[])
    {

        Thread t2 = new Thread(){
            public void run(){
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("compute value:" +computedValue);
            }

        };
        t2.start();


        Thread t = new Thread(){
           public void run(){

               int i = 1;
               int j = 1;
               int k = 0;

               while(true)
               {
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   k = i+j;

                   i=j;
                   j=k;
                   System.out.println("value: "+k);
                   computedValue = k;
               }

           }
        };
        t.start();
    }
}
