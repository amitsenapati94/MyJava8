package com.json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
  
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
  
public class JSONReadExample 
{
    public static void main(String[] args) throws Exception 
    {
        // parsing file "JSONExample.json"

        //BufferedReader br = new BufferedReader(new FileReader("java_module_name/src/file_name.txt"));

        Object obj = new JSONParser().parse(new FileReader("C:\\Amit\\workspace\\java\\MyJava8\\src\\main\\java\\com\\json\\JSONExample.json"));
          
        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;


        // getting firstName and lastName
        String firstName = (String) jo.get("firstName");
        jo.put("firstName","test");

        String lastName = (String) jo.get("lastName");
          
        System.out.println(firstName);
        System.out.println(lastName);
          
        // getting age
        long age = (long) jo.get("age");
        System.out.println(age);
          
        // getting address
        Map address = ((Map)jo.get("address"));
          
        // iterating address Map
        Iterator<Map.Entry> itr1 = address.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
            if(pair.getKey().equals("postalCode")){
                pair.setValue("75063");
            }
        }
          
        // getting phoneNumbers
        JSONArray ja = (JSONArray) jo.get("phoneNumbers");
          
        // iterating phoneNumbers
        Iterator itr2 = ja.iterator();
          
        while (itr2.hasNext()) 
        {
            itr1 = ((Map) itr2.next()).entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }

        System.out.println(jo.toJSONString());
    }
}