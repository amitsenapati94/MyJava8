package com.company;

import java.util.PriorityQueue;

/**
 * Created by amitsenapati on 8/26/17.
 */
public class PriorityQueueTest {

    public static void main(String a[])
    {
        PriorityQueue<String> pq = new PriorityQueue<String>();

        String[] sa = {"b","a","d","d"};

        for (String s : sa)
        {
            pq.add(s);

        }

        for(String s : sa)
        {
            System.out.println(pq.poll() + " ");
        }

    }
}
