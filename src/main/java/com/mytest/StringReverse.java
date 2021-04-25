package com.mytest;

public class StringReverse {

    public static void main(String[] args) {
        String str = "Automation";
        StringBuilder sb = new StringBuilder(str);
        //String answer = sb.reverse().toString();
        //System.out.println(answer);

        char[] chars = str.toCharArray();
        String answer = "";

        for(int i=str.length()-1;i>=0;i--){
            char c = chars[i];
            String temp = Character.toString(c);
            answer = answer + temp;
        }

        //System.out.println(answer);

        //reverse word by word
        String sentence = "I am java";
        String[] token = sentence.split(" ");    //used split method to print in reverse order
        for(int i=token.length-1; i>=0; i--)
        {
            //System.out.print(token[i] + " ");
        }

        //reverse word by word
        String sentence2 = "I am java";
        String[] token2 = sentence.split("");    //used split method to print in reverse order
        for(int i=token2.length-1; i>=0; i--)
        {
            System.out.print(token2[i] + "");
        }
    }
}
