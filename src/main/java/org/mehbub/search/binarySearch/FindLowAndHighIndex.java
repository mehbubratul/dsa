package org.mehbub.search.binarySearch;

/**
 * https://www.educative.io/blog/crack-amazon-coding-interview-questions
 * Given a sorted array of integers, return the low and high index of the given key.
 * You must return -1 if the indexes are not found.
 * The array length can be in the millions with many duplicates.
 * Runtime Complexity: Logarithmic, O(logn)
 * Memory Complexity: Constant, O(1)
 */
public class FindLowAndHighIndex {
    public int findLowIndex(int[] nums, int key) {

        int lowIndex = doBinarySearch(nums, key);
        return lowIndex;
    }

    private int doBinarySearch(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            System.out.println("start: " + start + " mid: " + mid + " end: " + end + " key: " + key + " nums[mid]: " + nums[mid]);

            if (nums[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (start > end) {
            return -1;
        }

        return start;
    }
}
