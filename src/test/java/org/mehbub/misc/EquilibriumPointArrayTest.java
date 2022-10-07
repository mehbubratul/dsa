package org.mehbub.misc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class EquilibriumPointArrayTest {

    @Test
    void test1() {
        int givenArray[] = {1, 3, 5, 2, 2};
        int expectedIndex = 2;
        int actualIndex = new EquilibriumPointArray().equilibriumPoint(givenArray);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test2() {
        int givenArray[] = {1, 3, 5, 2, 2, 3};
        int expectedIndex = -1;
        int actualIndex = new EquilibriumPointArray().equilibriumPoint(givenArray);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test3() {
        int givenArray[] = {1};
        int expectedIndex = -1;
        int actualIndex = new EquilibriumPointArray().equilibriumPoint(givenArray);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test4() {
        int givenArray[] = {0, 0};
        int expectedIndex = 0;
        int actualIndex = new EquilibriumPointArray().equilibriumPoint(givenArray);
        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void testFrontPrefix() {
        int givenArray[] = {1};//{1, 3, 5, 2, 2, 3};
        int frontPrefix[] = new EquilibriumPointArray().prefixSumFromFrontArray(givenArray);
        Arrays.stream(frontPrefix).forEach(System.out::println);
    }

    @Test
    void testRearPrefix() {
        int givenArray[] = {1};//{1, 3, 5, 2, 2, 3};
        int rearPrefix[] = new EquilibriumPointArray().prefixSumFromRearArray(givenArray);

        for (int i = rearPrefix.length - 1; i >= 0; i--) {
            System.out.println(rearPrefix[i]);
        }
    }

}