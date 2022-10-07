package org.mehbub.leetCode75.DayOne;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class FindPivotIndex_724Test {

    @Test
    void test8() {
        int givenArray[] = {1, 3, 5, 2, 2};
        int expectedIndex = 2;
        int actualIndex = new FindPivotIndex_724().pivotIndex(givenArray);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test9() {
        int givenArray[] = {1, 7, 3, 6, 5, 6};
        int expectedIndex = 3;
        int actualIndex = new FindPivotIndex_724().pivotIndex(givenArray);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test10() {
        int givenArray[] = {1, 2, 3};
        int expectedIndex = -1;
        int actualIndex = new FindPivotIndex_724().pivotIndex(givenArray);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test11() {
        int givenArray[] = {2, 1, -1};
        int expectedIndex = 0;
        int actualIndex = new FindPivotIndex_724().pivotIndex(givenArray);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test12() {
        int givenArray[] = {1};
        int expectedIndex = 0;
        int actualIndex = new FindPivotIndex_724().pivotIndex(givenArray);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test13() {
        int givenArray[] = {2, 3, -1, 8, 4};
        int expectedIndex = 3;
        int actualIndex = new FindPivotIndex_724().pivotIndex(givenArray);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test14() {
        int givenArray[] = {1, -1, 4};
        int expectedIndex = 2;
        int actualIndex = new FindPivotIndex_724().pivotIndex(givenArray);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test15() {
        int givenArray[] = {2,5};
        int expectedIndex = -1;
        int actualIndex = new FindPivotIndex_724().pivotIndex(givenArray);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test16() {
        int givenArray[] = {0, 0};
        int expectedIndex = 0;
        int actualIndex = new FindPivotIndex_724().pivotIndex(givenArray);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test17() {
        int givenArray[] = {-1, -1, -1, -1, 2};
        int expectedIndex = -1;
        int actualIndex = new FindPivotIndex_724().pivotIndex(givenArray);
        assertTrue(expectedIndex == actualIndex);
    }
}