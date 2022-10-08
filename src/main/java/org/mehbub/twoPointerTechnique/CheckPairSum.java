package org.mehbub.twoPointerTechnique;

/**
 * Find if There is a Pair in A[0..N-1] with Given Sum
 * Using Two-pointers Technique
 * => We take two pointers, one representing the first element and other representing the last element of the array,
 * and then we add the values kept at both the pointers.
 * If their sum is smaller than X then we shift the left pointer to right or
 * if their sum is greater than X then we shift the right pointer to left,
 * in order to get closer to the sum.
 * We keep moving the pointers until we get the sum as X.
 * Time Complexity:  O(n log n) (As sort function is used)
 * Auxiliary Space: O(1), since no extra space has been taken.
 */

public class CheckPairSum {

    public boolean isPairSum(int[] sortedArray, int length, int val) {

        int leftMostIndex = 0;
        int rightMostIndex = length - 1;

        while (leftMostIndex < rightMostIndex) {

            if (sortedArray[leftMostIndex] + sortedArray[rightMostIndex] == val) {
                return true;
            }

            if (sortedArray[leftMostIndex] + sortedArray[rightMostIndex] > val) {
                rightMostIndex = rightMostIndex - 1;
            } else if (sortedArray[leftMostIndex] + sortedArray[rightMostIndex] < val) {
                leftMostIndex = leftMostIndex + 1;
            }
        }

        return false;
    }
}
