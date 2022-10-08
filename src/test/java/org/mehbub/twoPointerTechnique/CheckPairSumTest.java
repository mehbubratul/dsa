package org.mehbub.twoPointerTechnique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPairSumTest {

    @Test
    void test1() {
        int arr[] = {2, 3, 5, 8, 9, 10, 11};

        int val = 17;

        boolean actualResult = new CheckPairSum().isPairSum(arr, arr.length, val);

        assertTrue(actualResult);
    }

}