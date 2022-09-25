package org.mehbub.search.binarySearch;

/**
 * 1095. Find in Mountain Array
 * https://leetcode.com/problems/find-in-mountain-array/
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 */
public class FindIndexInMountainArray {

    public int findInMountainArray(int target, int[] mountainArr) {

        if (mountainArr.length == 0) {
            return -1;
        }

        int peak = findPeakInMountainArray(mountainArr);

        int minIndex = orderAgnosticBinarySearch(mountainArr, target, 0, peak);

        if (minIndex == -1) {
            minIndex = orderAgnosticBinarySearch(mountainArr, target, peak + 1, mountainArr.length - 1);
        }

        return minIndex;
    }

    private int orderAgnosticBinarySearch(int[] mountainArr, int target, int start, int end) {
        boolean isAsc = mountainArr[start] < mountainArr[end];
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mountainArr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > mountainArr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > mountainArr[mid + 1]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    private int findPeakInMountainArray(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (mountainArr[mid] > mountainArr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;
    }


}
