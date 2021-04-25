package com.algo;

import java.util.HashSet;
import java.util.Set;

public class FindPairUnSorted {

    public static void main(String[] args) {

        FindPairUnSorted findPairUnSorted = new FindPairUnSorted();
        int[] myArray = {1,2,5,4,6,4,7};
        int sum = 8;
        findPairUnSorted.findMatch(sum,myArray);
    }

    public void findMatch(int sum, int[] myArray){
        //System.out.println(myArray.length);
        Set<Integer> mySet = new HashSet<>();

        for (int i =0; i < myArray.length; i++){
            int diff = sum - myArray[i];
            if(mySet.contains(myArray[i])){
                System.out.println("found match");
                System.out.println(myArray[i] + " " + diff);
            }else{
                mySet.add(diff);
            }

        }

    }

}
