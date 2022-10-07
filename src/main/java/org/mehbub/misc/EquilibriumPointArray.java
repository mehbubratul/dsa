package org.mehbub.misc;

/**
 * Given an array A of n positive numbers.
 * The task is to find the first Equilibrium Point in the array.
 * Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
 * <p>
 * Note: Return the index of Equilibrium point. (0-based index)
 */
public class EquilibriumPointArray {

    /**
     * The task is to complete the function equilibriumPoint()
     * which takes the array and n as input parameters
     * and returns the point of equilibrium.
     * Return -1 if no such point exists.
     * <p>
     * Expected Time Complexity: O(n)
     * Expected Auxiliary Space: O(1)
     *
     * @param num
     * @return
     */
    public int equilibriumPoint(int[] num) {

        /*
        int tempNum[] = new int[num.length];

        for (int index = 0; index < num.length; index++) {
            if (index == 0) {
                tempNum[0] = num[0];
            } else {
                tempNum[index] = num[index] + tempNum[index - 1];
            }
        }

        return linearEqPoint(num, tempNum);
        */

        int frontPrefix[] = prefixSumFromFrontArray(num);
        int rearPrefix[] = prefixSumFromRearArray(num);

        for (int i = 0; i < num.length; i++) {
            if (frontPrefix[i] == rearPrefix[i]) {
                return i;
            }
        }
        return -1;
    }

    public int[] prefixSumFromRearArray(int[] num) {
        int rear[] = new int[num.length];

        rear[num.length - 1] = num[num.length - 1];

        for (int index = num.length - 2; index >= 0; index--) {
            rear[index] = num[index] + rear[index + 1];
        }

        return rear;
    }

    public int[] prefixSumFromFrontArray(int[] num) {

        int front[] = new int[num.length];

        front[0] = num[0];

        for (int index = 1; index < num.length; index++) {
            front[index] = num[index] + front[index - 1];
        }

        return front;
    }

    private int linearEqPoint(int[] num, int[] tempNum) {
        int total = tempNum[tempNum.length - 1];
        int leftSum = 0;
        int rightSum = total;

        for (int i = 0; i < num.length; i++) {
            if (i > 0) {
                leftSum = tempNum[i - 1];
                rightSum = total - tempNum[i];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
