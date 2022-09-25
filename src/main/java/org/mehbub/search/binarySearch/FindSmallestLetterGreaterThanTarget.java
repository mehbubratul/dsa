package org.mehbub.search.binarySearch;

/**
 * 744. Find Smallest Letter Greater Than Target
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * Given a characters array letters that is sorted in non-decreasing order and a character target,
 * return the smallest character in the array that is larger than target.
 */
public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
//            System.out.println(start);
//            System.out.println(letters.length);
//            System.out.println(start % letters.length);
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {// if (target > letters[mid]) {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
