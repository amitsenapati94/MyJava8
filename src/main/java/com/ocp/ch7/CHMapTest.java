package main.java.com.ocp.ch7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CHMapTest {

    public static void main(String[] args) {
        Map<String, Object> foodData = new HashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for(String key: foodData.keySet()) {
            foodData.remove(key);
        }
        System.out.println("before remove:"+foodData);

        Iterator<Map.Entry<String, Object>> entryIt = foodData.entrySet().iterator();

        while (entryIt.hasNext()) {
            Map.Entry<String, Object> entry = entryIt.next();
            // Check if Value associated with Key is 10
            if (entry.getKey().equals("penguin")) {
                // Remove the element
                entryIt.remove();
            }
        }

        System.out.println("before remove:"+foodData);


    }
}
