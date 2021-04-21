package main.java.com.company;
import java.util.*;

/**
 * Created by amitsenapati on 8/26/17.
 */
public class LinkedListTest {

    public static void main(String a[])
    {
        List<String> list = new ArrayList<String>();
        //List<String> list = new LinkedList<String>();

        //PriorityQueue<String> list = new PriorityQueue<String>();

        list.add(0,"c");
        list.add(0,"b");
        list.add(0,"a");

        for (String s : list)
        {
            System.out.println(s + " ");
        }

        //System.out.println(list.peek());

        System.out.println(list.get(0));

        String s = "girl";

         Integer int1 = new Integer(22);

        System.out.println(int1.hashCode());
    }
}
