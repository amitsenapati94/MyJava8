package com.ch1;

public class ReplacePattern {

    public static void main(String[] args) {

        String input = "i am a boy";
        System.out.println(replacePattern(input));

    }

    static String replacePattern(String input){
        String output = "";

        output = input.replace(" ","%20");

        return output;
    }

   /* static String byCharArray(String input){


        char[] inputChars = new char[128];

        for(int i=0;  i< input.length(); i++){
            if(input.charAt(0) == " "){
                inputChars[]
            }
        }
    }*/
}
