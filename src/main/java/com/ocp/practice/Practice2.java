package com.ocp.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice2 {

    public static void main(String[] args) {

        int[] intArray1 = {2,3,4,8};
        int[] intArray2 = {5,6,7,1};

        List<Integer> list1 = Arrays.stream(intArray1).boxed().collect(Collectors.toList());

        List<Integer> list2 = Arrays.stream(intArray2).boxed().collect(Collectors.toList());

        List<Integer> list = Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());

        //System.out.println(list);

        List<Integer> listAll = new ArrayList<>();
        listAll.addAll(list1);
        listAll.addAll(list2);
        listAll.sort(Comparator.comparing(Integer::intValue));

        //System.out.println(listAll);


        Practice2 practice2 = new Practice2();


        //bubblesort

        int[] intArray = {6,5,7,1,99,678,9};

         int length = intArray.length;

         for (int i = 0; i < length; i ++){
             for( int j = 0; j < length-1; j ++){
                 if(intArray[j] > intArray[j+1]){
                     int temp = intArray[j+1];
                     intArray[j+1] = intArray[j];
                     intArray[j] = temp;
                 }
             }
             print(intArray);

         }


    }

    public static void print(int[] listToSort) {
        for (int el : listToSort) {
            System.out.print(el + ",");
        }
        System.out.println();
    }

    private static int[] swap(int[] input, int iIndex, int jIndex){

        int temp = input[iIndex];
        input[iIndex] = input[jIndex];
        input[jIndex] = temp;

        return input;
    }

}
