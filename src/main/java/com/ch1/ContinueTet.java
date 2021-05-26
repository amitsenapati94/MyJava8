package com.ch1;

import java.util.Arrays;
import java.util.List;

public class ContinueTet {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("test","test1");

        for(String s: list){

            System.out.println(s);
            if(1==2){

            }else{
                if(1==1){
                    continue;
                }
                if(2==2){
                    System.out.println("after");
                }
            }
        }


    }
}
