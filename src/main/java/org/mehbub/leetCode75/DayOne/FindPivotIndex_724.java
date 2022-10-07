package org.mehbub.leetCode75.DayOne;

/**
 * Link: https://leetcode.com/problems/find-pivot-index/?envType=study-plan&id=level-1
 * Ques: 724. Find Pivot Index
 * Level: Easy
 * Tag: Array, Prefix Sum
 * <p>
 * Given an array of integers nums, calculate the pivot index of this array.
 * <p>
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 * <p>
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 * <p>
 * Return the leftmost pivot index. If no such index exists, return -1.
 * <p>
 * Note: This question is the same as 1991: https://leetcode.com/problems/find-the-middle-index-in-array/
 * Complexity Analysis
 * <p>
 * Time complexity: O(N) ;
 * <p>
 * Space complexity: O(1) ; space used by totalSum & curSum
 *
 * Further Read : https://leetcode.com/problems/find-the-middle-index-in-array/discuss/1444082/Java-5-Liner-(One-Pass)
 */

public class FindPivotIndex_724 {

    public int pivotIndex(int[] nums) {
        if (nums.length == 0) return -1;

        int totalSum = 0, curSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int index = 0; index < nums.length; index++) {
            if (curSum == totalSum - curSum - nums[index]) {
                return index;
            }
            curSum += nums[index];
        }

        return -1;
    }
}
