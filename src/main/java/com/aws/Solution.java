package com.aws;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'foo' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY codeList
     *  2. STRING_ARRAY shoppingCart
     */

    public static int foo(List<String> codeList, List<String> shoppingCart) {
    // Write your code here

        List<String> codeListFinal = new ArrayList<>();

        for(String code : codeList){
            
                if(code.contains(" ")){
                    String[] codearr = code.split(" ");
                    
                    for(int i =0; i< codearr.length; i ++){
                        codeListFinal.add(codearr[i]);
                    }
                }else{
                    codeListFinal.add(code);
                }
        }
                
        int result = 0;
        //int i = 0;
        int j = 0;
        int imax = shoppingCart.size();
        int jmax = codeList.size();
        
        //if(imax == jmax){
        for (int i = 0; i <shoppingCart.size(); i++){
            
            if(codeListFinal.get(j).equals("anything")){
                
                result = 1;
                j++;
                
            }else if(shoppingCart.get(i).equals(codeListFinal.get(j))){
                result = 1;
                j++;
                
            }else{
                result = 0;
                //j++;
            }
            }
        //}
    
    return result;

    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int codeListCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> codeList = new ArrayList<>();

        codeList.add("apple apricot");
        codeList.add("banana anything guava");
        codeList.add("papaya anything");

       /* for (int i = 0; i < codeListCount; i++) {
            String codeListItem = bufferedReader.readLine();
            codeList.add(codeListItem);
        }*/

        //int shoppingCartCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> shoppingCart = new ArrayList<>();


        shoppingCart.add("banana");
        shoppingCart.add("orange");
        shoppingCart.add("guava");
        shoppingCart.add("apple");

        shoppingCart.add("apricot");
        shoppingCart.add("papaya");
        shoppingCart.add("kiwi");
        shoppingCart.add("apple");
        shoppingCart.add("apricot");
        shoppingCart.add("papaya");
        shoppingCart.add("kiwi");

      /*  for (int i = 0; i < shoppingCartCount; i++) {
            String shoppingCartItem = bufferedReader.readLine();
            shoppingCart.add(shoppingCartItem);
        }*/

        int result = Result.foo(codeList, shoppingCart);

        System.out.println("result: "+result);

      /*  bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
