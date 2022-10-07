package org.mehbub.search.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLowAndHighIndexTest {

    @Test
    void findLow_1() {
        int[] nums = {1, 2, 5, 5, 5, 5, 5, 5, 5, 20};
        int key = 2;
        int expectedLow = 1;
        int actualLow = new FindLowAndHighIndex().findLowIndex(nums, key);
        assertTrue(expectedLow == actualLow);
    }

    @Test
    void findLow_2() {
        int[] nums = {1, 2, 5, 5, 5, 5, 5, 5, 5, 20};
        int key = 5;
        int expectedLow = 2;
        int actualLow = new FindLowAndHighIndex().findLowIndex(nums, key);
        assertTrue(expectedLow == actualLow);
    }

    @Test
    void findLow_3() {
        int[] nums = {1, 2, 5, 5, 5, 5, 5, 5, 5, 20};
        int key = 1;
        int expectedLow = 0;
        int actualLow = new FindLowAndHighIndex().findLowIndex(nums, key);
        assertTrue(expectedLow == actualLow);
    }

    @Test
    void findLow_4() {
        int[] nums = {1, 2, 5, 5, 5, 5, 5, 5, 5, 20};
        int key = 20;
        int expectedLow = 9;
        int actualLow = new FindLowAndHighIndex().findLowIndex(nums, key);
        assertTrue(expectedLow == actualLow);
    }

    @Test
    void findLow_5() {
        int[] nums = {1, 2, 5, 5, 5, 5, 5, 5, 5, 20};
        int key = 21;
        int expectedLow = -1;
        int actualLow = new FindLowAndHighIndex().findLowIndex(nums, key);
        assertTrue(expectedLow == actualLow);
    }
}