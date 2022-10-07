package org.mehbub.search.binarySearch;

/**
 * 33. Search in Rotated Sorted Array
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 * This algo will not work for duplicate value present in array
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        int pivotIndex = findPivot(nums);

        int firstTry = binarySearch(nums, target, 0, pivotIndex);

        if (firstTry == -1) {
            firstTry = binarySearch(nums, target, pivotIndex + 1, nums.length - 1);
        }
        return firstTry;
    }

    private int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
