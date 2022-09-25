package org.mehbub.search.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSmallestLetterGreaterThanTargetTest {

    @Test
    void testTarget() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char expected = 'c';
        char actual = new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, target);
        assertTrue(actual == expected);
    }

    @Test
    void testTargetNotPresentThenNextPresentChar() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char expected = 'f';
        char actual = new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, target);
        assertTrue(actual == expected);
    }

}