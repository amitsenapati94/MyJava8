//https://www.journaldev.com/122/concurrenthashmap-in-java

package main.java.com.concurrenthashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","1");
        map.put("3","1");
        map.put("4","1");
        map.put("5","1");
        System.out.println("hashmap before interation: "+map);

        Iterator<String> it = map.keySet().iterator();

        while(it.hasNext()){
            String key = it.next();
            if(key.equals("3")){
                map.put("31","31");
                break;
            }
        }
        System.out.println("hashmap after interation: "+map);


        Map<String,String> cmap = new ConcurrentHashMap<>();
        cmap.put("1","1");
        cmap.put("2","1");
        cmap.put("3","1");
        cmap.put("4","1");
        cmap.put("5","1");
        System.out.println("ConcurrentHashMap before interation: "+cmap);

        Iterator<String> itc = cmap.keySet().iterator();

        while(itc.hasNext()){
            String key = itc.next();
            if(key.equals("3")){
                cmap.put("31","31");
            }
        }
        System.out.println("ConcurrentHashMap before interation: "+cmap);

    }
}
