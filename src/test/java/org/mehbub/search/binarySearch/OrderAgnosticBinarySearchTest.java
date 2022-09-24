package org.mehbub.search.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderAgnosticBinarySearchTest {

    @Test
    void testAsc() {
        // given
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        // expected
        int target = 14;
        int expectedIndex = 6;
        //actual

        int actualElement = new OrderAgnosticBinarySearch().doOrderAgnosticBinarySearch(arr, target);
        assertTrue(actualElement == expectedIndex);
    }

    @Test
    void testAsc2() {
        // given
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        // expected
        int target = 15;
        int expectedIndex = -1;
        //actual

        int actualElement = new OrderAgnosticBinarySearch().doOrderAgnosticBinarySearch(arr, target);
        assertTrue(actualElement == expectedIndex);
    }

    @Test
    void testDesc() {
        // given
        int[] arr = {48, 36, 20, 14, 12, 11, 9, 6, 4, 2};
        // expected
        int target = 14;
        int expectedIndex = 3;
        //actual

        int actualElement = new OrderAgnosticBinarySearch().doOrderAgnosticBinarySearch(arr, target);
        assertTrue(actualElement == expectedIndex);
    }

    @Test
    void testDesc2() {
        // given
        int[] arr = {48, 36, 20, 14, 12, 11, 9, 6, 4, 2};
        // expected
        int target = 15;
        int expectedIndex = -1;
        //actual

        int actualElement = new OrderAgnosticBinarySearch().doOrderAgnosticBinarySearch(arr, target);
        assertTrue(actualElement == expectedIndex);
    }

}