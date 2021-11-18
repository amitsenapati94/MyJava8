package com.leetcode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] intArray = new int[]{2, 7, 11, 15};
        int[] result = TwoSum.twoSum(intArray, 9);

        System.out.println(result[0]);
        System.out.println(result[1]);

    }

    public static int[] twoSum2(int[] nums, int target) {

        int matchedIndices[] = new int[2];

        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];

            if (map.containsKey(nums[i])) {

                matchedIndices[0] = map.get(nums[i]);//2
                matchedIndices[1] = i;

                //2,7

            } else {
                map.put(diff, i);
                //7,2
            }
        }

        return matchedIndices;
    }

    public static int[] twoSum(int[] nums, int target) {

        int matchedIndices[] = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int k = 0; k < nums.length; k++) {

            int diff = target - nums[k];
            if (map.containsKey(nums[k])) {
                System.out.println(map.get(nums[k]) + ":" + k);
                matchedIndices[0] = map.get(nums[k]);
                matchedIndices[1] = k;
            } else {
                map.put(diff, k);
                //7,0
                //2,1
            }
        }
        return matchedIndices;
    }
}
