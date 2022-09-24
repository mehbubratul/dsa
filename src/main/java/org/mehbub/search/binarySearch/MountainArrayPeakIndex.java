package org.mehbub.search.binarySearch;

/**
 * 852. Peak Index in a Mountain Array
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 * An array arr a mountain if the following properties hold:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
 *
 * You must solve it in O(log(arr.length)) time complexity.
 */

public class MountainArrayPeakIndex {

    public static int peakIndexInMountainArray(int[] arr) {

        int ans = binarySearch(arr);
        return ans;
    }

    private static int binarySearch(int[] arr){

        int start = 0;
        int end = arr.length - 1 ;

        while(start < end ){
            int mid = start + (end - start) /2;

            if(arr[mid + 1] > arr[mid]){ // look in right search space
                start = mid + 1;
            } else if (arr[mid + 1] < arr[mid]){ // look in left search space
                end = mid;
            } else{
                start = mid;
            }
        }
        return start;
    }
}
