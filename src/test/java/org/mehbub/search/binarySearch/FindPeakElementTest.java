package org.mehbub.search.binarySearch;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindPeakElementTest {

    @Test
    void findPeakElement() {
    }

    @Test
    void givenAnArraySetWillReturnIndex2AsPeakElement(){
        int[] givenArray = {1,2,3,1};
        int expectedIndex = 2;

        int peakIndex = FindPeakElement.findPeakElement(givenArray);
        assertTrue(peakIndex == expectedIndex);
    }

    @Test
    void givenAnArraySetWillReturnIndex5AsPeakElement(){
        int[] givenArray = {1,2,1,3,5,6,4};
        int expectedIndex = 5;

        int peakIndex = FindPeakElement.findPeakElement(givenArray);
        assertTrue(peakIndex == expectedIndex);
    }

}