package org.mehbub.search.binarySearch;

import org.junit.jupiter.api.Test;
import  org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MountainArrayPeakIndexTest {

    @Test
    void givenAnArraySetWillReturnIndex1AsPeakElement(){
        int[] givenArray = {0,1,0};
        int expectedIndex = 1;

        int peakIndex = MountainArrayPeakIndex.peakIndexInMountainArray(givenArray);
        assertTrue(peakIndex == expectedIndex);
    }

    @Test
    void givenAnArraySetWillReturnIndexOneAsPeakElement(){
        int[] givenArray = {0,2,1,0};
        int expectedIndex = 1;

        int peakIndex = MountainArrayPeakIndex.peakIndexInMountainArray(givenArray);
        assertTrue(peakIndex == expectedIndex);
    }

    @Test
    void givenAnArraySetWillReturnIndexOne1AsPeakElement(){
        int[] givenArray = {0,10,5,2};
        int expectedIndex = 1;

        int peakIndex = MountainArrayPeakIndex.peakIndexInMountainArray(givenArray);
        assertTrue(peakIndex == expectedIndex);
    }


}