package main.java.com.ocp.generic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueCheck {

    public static void main(String[] args) {

        UniqueCheck uniqueCheck = new UniqueCheck();

        List<String> myList = Arrays.asList("test","test3","test");

        System.out.println(uniqueCheck.containsUnique(myList));

    }

    public <T> boolean containsUnique(List<T> list){

        Set<T> set = new HashSet<>();

        for(T t : list){
            if(!set.add(t)){
                System.out.println("set:"+set);
                return false;
            }
        }
        return true;
    }
}
