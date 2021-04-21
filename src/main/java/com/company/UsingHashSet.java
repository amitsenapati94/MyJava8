package main.java.com.company;
import java.util.*;
/**
 * Created by amitsenapati on 3/6/17.
 */
public class UsingHashSet {

    //if Customer does not override equals and hashcode then the size will be calculated as 2
    //with overriden equals and hascode the size will be 1

    public static void main(String a[])
    {
        Customer customer1 = new Customer();
        customer1.setId(15);
        customer1.setName("Amit");


        Customer customer2 = new Customer();
        customer2.setId(15);
        customer2.setName("Amit");

        Set<Customer> set = new HashSet<Customer>();
        set.add(customer1);
        set.add(customer2);

        System.out.println(set.size());

    }
}
