package org.mehbub.search.binarySearch;

/**
 * 162. Find Peak Element
 * https://leetcode.com/problems/find-peak-element/
 *
 * A peak element is an element that is strictly greater than its neighbors.
 *
 * Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 *
 * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
 *
 * You must write an algorithm that runs in O(log n) time.
 */

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int peak = findPeakElement(nums);
        System.out.println(peak);
    }

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start) /2;
            if(nums[mid] > nums[mid+1]){ // search in right side
                end = mid;
            }else { // search in left side
                start = mid +1;
            }
        }
        return start;
    }
}
