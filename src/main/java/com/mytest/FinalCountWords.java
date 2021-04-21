package main.java.com.mytest;

import java.util.HashMap;
import java.util.Map;

public class FinalCountWords {

    public static void main(String[] args) {
        String str = "This this is is done by Saket Saket";

        String[] tokens =  str.split(" ");

        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i< tokens.length; i++){
            if(map.containsKey(tokens[i])) {
                int count = map.get(tokens[i]);
                map.put(tokens[i], ++count);
            }else{
                map.put(tokens[i], 1);
            }
        }

        System.out.println(map);
    }
}
