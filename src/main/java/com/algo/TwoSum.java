package com.algo;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        twoSum.m1();


    }

    public void m1(){
        TwoSum.Solution solution = new TwoSum.Solution();
         //int[] nums = {2, 7, 11, 15};
        int[] nums = {1,2,5,4,6,4,7};

        int target = 9;

         int[] indices = solution.twoSum(nums,target);
        System.out.println(indices.length);
    }




class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] matchedIndices = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int k = 0; k < nums.length; k++) {

            int diff = target - nums[k];
            if(map.containsKey(nums[k])){
                //System.out.println(diff+ ":"+nums[k]);
                System.out.println(map.get(nums[k]) +":" + k);
                matchedIndices[0] = map.get(nums[k]);
                matchedIndices[1] = k;
            }else{
                map.put(diff,k);

            }
        }


//        for (int k = 0; k < nums.length; k++) {
//
//            for (int j = 0; j < nums.length; j++) {
//
//                if (nums[k] + nums[j] == target) {
//                    matchedIndices[0] = k;
//                    matchedIndices[1] = j;
//                    break;
//                }
//            }
//        }
        return matchedIndices;
    }
}
}
