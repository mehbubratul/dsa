package org.mehbub.leetCode75.DayOne;

/**
 * Link: https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1
 * Ques: 1480. Running Sum of 1d Array
 * Level: Easy
 * Tag: Array, Prefix Sum
 *
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 *
 * Complexity Analysis
 *
 * Time complexity: O(n) where nn is the length of the input array. This is because we use a single loop that iterates over the entire array to calculate the running sum.
 *
 * Space complexity: O(1) since we don't use any additional space to find the running sum. Note that we do not take into consideration the space occupied by the output array.
 */

public class RunningSum_1480 {

    @Deprecated
    public int[] runningSum(int[] nums) {
        int[] tempArray = new int[nums.length];
        for (int index = 0; index < nums.length; index++) {
            tempArray[index] = index == 0 ? nums[index] : nums[index] + tempArray[index - 1];
        }
        return tempArray;
    }

    public int[] runningSum2(int[] nums) {
        int[] tempArray = new int[nums.length];
        tempArray[0] = nums[0];
        for (int index = 1; index < nums.length; index++) {
            tempArray[index] = nums[index] + tempArray[index - 1];
        }
        return tempArray;
    }

    public int[] runningSum3(int[] nums) {

        for (int index = 1; index < nums.length; index++) {
            nums[index] = nums[index] + nums[index - 1];
        }
        return nums;
    }
}
