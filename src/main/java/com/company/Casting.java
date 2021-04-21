package main.java.com.company;

import java.util.*;

/**
 * Created by amitsenapati on 12/1/17.
 */
public class Casting {


    public static void main(String a[])
    {

        Casting cas = new Casting();
        Object object = cas.m();

        List<Customer> customers = castObjectToList(object, Customer.class);

        //List<Customer> customers = (List<Customer>) cas.m();

        //List customers = (List) cas.m();

        //Customer customer = castObjectToList2(object, Customer.class);

        //Customer customer = (Customer)customers.get(0);


    }

    public Object m()
    {
        //List<Customer> customerList = new ArrayList<Customer>();
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer());

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee());

        Integer count = new Integer(100);

        return count;
        //return Arrays.asList(new Customer(), new Employee());

        //return Arrays.asList(new Employee(), new Customer());

        //return customerList;

        //return employeeList;
    }


    class Customer {

    }

    class Employee {

    }

    private static <T> List<T> castObjectToList(Object obj, Class<T> clazz)
    {
        if(obj == null)
        {
            return null;
        }

        if (obj instanceof List<?>)
        {
            List<T> result = new ArrayList<T>();

                for (Object o : (List<?>) obj)
                {
                    result.add(clazz.cast(o));
                }
            return result;
        }
        throw new ClassCastException();

    }



    public static <T> T convertInstanceOfObject(Object o, Class<T> clazz) {
        try {
            return clazz.cast(o);
        } catch (ClassCastException e) {
            return null;
        }
    }
}
