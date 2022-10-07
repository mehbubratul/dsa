package org.mehbub.leetCode75.DayOne;

import org.junit.jupiter.api.Test;
import org.mehbub.misc.EquilibriumPointArray;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RunningSum_1480Test {

    @Test
    void test1() {
        int givenArray[] = {1, 2, 3, 4};
        int expectedArray[] = {1, 3, 6, 10};
        int actualArray[] = new RunningSum_1480().runningSum(givenArray);
        assertTrue(Arrays.equals(expectedArray, actualArray));
    }

    @Test
    void test2() {
        int givenArray[] = {1, 2, 3, 4};
        int expectedArray[] = {1, 3, 6, 10};
        int actualArray[] = new RunningSum_1480().runningSum2(givenArray);
        assertTrue(Arrays.equals(expectedArray, actualArray));
    }

    @Test
    void test3() {
        int givenArray[] = {1, 2, 3, 4};
        int expectedArray[] = {1, 3, 6, 10};
        int actualArray[] = new RunningSum_1480().runningSum3(givenArray);
        assertTrue(Arrays.equals(expectedArray, actualArray));
    }

}