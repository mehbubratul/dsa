package org.mehbub.search.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void test1() {
        // given
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        // expected
        int target = 14;
        int expectedIndex = 6;
        //actual
        BinarySearch binarySearch = new BinarySearch();
        int actualElement = binarySearch.doBinarySearch(arr, target);
        assertTrue(actualElement == expectedIndex);
    }
}