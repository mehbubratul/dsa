package org.mehbub.search.binarySearch;


/**
 * If we don't know the that the array is sorted in which order
 */
public class OrderAgnosticBinarySearch {

    public int doOrderAgnosticBinarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // target not found
    }
}
