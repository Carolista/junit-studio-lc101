package test;

// TODO: import JUnit, assertion methods
import org.junit.Test;
import static org.junit.Assert.*;

// TODO: import BonusBinarySearch class from main package
import main.BonusBinarySearch;


public class BonusBinarySearchTest {

    // TODO: Initialize reusable arrays of sorted integers to use as test data
    int[] positiveNumArray = {2, 5, 7, 18, 29, 44, 86};
    int[] negativeNumArray = {-47, -24, -1, 0, 14, 63, 99};
    int[] singleNumArray = {50};
    int[] emptyArray = new int[0];


    // POSITIVE TEST CASES

    // TODO: Test a number being found somewhere in the first half of the array
    @Test
    public void firstHalf() {
        String message = "a number in the first half of the array is found";
        int testNum = 7;
        int expected = 2;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(message, expected, actual);
    }

    // TODO: Test a number being found somewhere in the second half of the array
    @Test
    public void secondHalf() {
        String message = "a number in the second half of the array is found";
        int testNum = 44;
        int expected = 5;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(message, expected, actual);
    }

    // TODO: Test a number being found exactly in the middle of an array with an odd length
    @Test
    public void exactMiddle() {
        String message = "a number in the exact middle of the array is found";
        int testNum = 18;
        int expected = 3;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(message, expected, actual);
    }

    // TODO: Test a number being found at the very beginning of the array
    @Test
    public void firstElement() {
        String message = "a number at the beginning of the array is found";
        int testNum = 2;
        int expected = 0;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(message, expected, actual);
    }


    // TODO: Test a number being found at the very end of the array
    @Test
    public void lastElement() {
        String message = "a number at the end of the array is found";
        int testNum = 86;
        int expected = 6;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(message, expected, actual);
    }

    // TODO: Test an array that includes negative numbers
    @Test
    public void negativeNumbers() {
        String message = "a negative number is found";
        int testNum = -24;
        int expected = 1;
        int actual = BonusBinarySearch.binarySearch(negativeNumArray, testNum);
        assertEquals(message, expected, actual);
    }

    // NEGATIVE TEST CASES

    // TODO: Test a number not being found in an array
    @Test
    public void notFound() {
        String message = "a number is not found";
        int testNum = 100;
        int expected = -1;
        int actual = BonusBinarySearch.binarySearch(positiveNumArray, testNum);
        assertEquals(message, expected, actual);
    }


    // EDGE CASES

    // TODO: Test finding a number in an array of length 1
    @Test
    public void singleNumber() {
        String message = "a number is found in an array with a length of one";
        int testNum = 50;
        int expected = 0;
        int actual = BonusBinarySearch.binarySearch(singleNumArray, testNum);
        assertEquals(message, expected, actual);
    }

    // TODO: Test an empty array
    @Test
    public void emptyArray() {
        String message = "a number is not found in an empty array";
        int testNum = 20;
        int expected = -1;
        int actual = BonusBinarySearch.binarySearch(emptyArray, testNum);
        assertEquals(message, expected, actual);
    }

}
