package main.java.com.company;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


/**
 * Created by amitsenapati on 8/15/16.
 */
public class ListRemove {

    public static void main(String a[])
    {

        List<String> list = Arrays.asList("home","mobile","fax","office", "other");

       list= list.stream().filter(e -> e.startsWith("home") || e.startsWith("office") || e.startsWith("mobile"))
                .collect(Collectors.toList());

        //list= list.stream()
               // .filter(e -> e.startsWith("home") )
               // .filter(e -> e.startsWith("office"))
                //.collect(Collectors.toList());

        list.stream().forEach(System.out::println);
    }



}
