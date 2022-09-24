package org.mehbub.search.binarySearch;

public class BinarySearch {

    /**
     * Find the middle element
     * if target > mid => search in right
     * if target < mid => search in left
     * if target == mid => element found
     *
     */

    int doBinarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid] ){
                start = mid + 1;
            }else if( target < arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1; // target not found
    }
}
