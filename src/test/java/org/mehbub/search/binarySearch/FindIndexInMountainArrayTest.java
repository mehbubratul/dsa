package org.mehbub.search.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIndexInMountainArrayTest {


    @Test
    void testPeakAsTargetIndex() {
        int[] arr = {0, 1, 4, 5, 3, 1};
        int target = 5;
        int expectedIndex = 3;

        int actualIndex = new FindIndexInMountainArray().findInMountainArray(target, arr);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void testValuePresentInLeftOfPeakAsTargetIndex() {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int expectedIndex = 2;

        int actualIndex = new FindIndexInMountainArray().findInMountainArray(target, arr);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void testValuePresentInRightOfPeakAsTargetIndex() {
        int[] arr = {0,1,2,4,5,3,1};
        int target = 3;
        int expectedIndex = 5;

        int actualIndex = new FindIndexInMountainArray().findInMountainArray(target, arr);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void testValueDoNotExits() {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        int expectedIndex = -1;

        int actualIndex = new FindIndexInMountainArray().findInMountainArray(target, arr);
        assertTrue(expectedIndex == actualIndex);
    }

}