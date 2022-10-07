package org.mehbub.search.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayTest {

    @Test
    void test1(){
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int expectedIndex = 4;

        int actualIndex = new SearchInRotatedSortedArray().search(nums, target);

        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test2(){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;

        int expectedIndex = -1;

        int actualIndex = new SearchInRotatedSortedArray().search(nums, target);

        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test3(){
        int[] nums = {1};
        int target = 0;

        int expectedIndex = -1;

        int actualIndex = new SearchInRotatedSortedArray().search(nums, target);

        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test4(){
        int[] nums = {1};
        int target = 1;

        int expectedIndex = 0;

        int actualIndex = new SearchInRotatedSortedArray().search(nums, target);

        assertTrue(expectedIndex == actualIndex);
    }

    @Test
    void test5(){
        int[] nums = {5,1,3};
        int target = 5;

        int expectedIndex = 0;

        int actualIndex = new SearchInRotatedSortedArray().search(nums, target);

        assertTrue(expectedIndex == actualIndex);
    }

}