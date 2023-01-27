package test;

import org.junit.Test;

import static org.junit.Assert.*;

// TODO: import BalancedBrackets class from main package
import main.BalancedBrackets;


public class BalancedBracketsTest {

    // POSITIVE TEST CASES

    // TODO: Refactor example test from instructions to use AAA pattern and message parameter
    @Test
    public void onlyBracketsReturnsTrue() {
        String spec = "a single set of balanced brackets returns true";
        String testData = "[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    // TODO: Test balanced brackets in front of other characters — "[]LaunchCode"
    @Test
    public void pairOfBracketsBeforeOtherCharacters() {
        String spec = "a pair of balanced brackets before other characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    // TODO: Test balanced brackets around other characters — "[LaunchCode]"
    @Test
    public void pairOfBracketsAroundOtherCharacters() {
        String spec = "a pair of balanced brackets before other characters returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    // TODO: Test balanced brackets within other characters — "Launch[Code]"
    @Test
    public void pairOfBracketsAmongOtherCharacters() {
        String spec = "a pair of balanced brackets among other characters returns true";
        String testData = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    // TODO: Test multiple consecutive pairs of balanced brackets — "[][][]"
    @Test
    public void threeConsecutivePairsOfBrackets() {
        String spec = "three consecutive pair of balanced brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    // TODO: Test multiple nested balanced brackets — "[[[]]]"
    @Test
    public void threeNestedPairsOfBrackets() {
        String spec = "three nested pair of balanced brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }


    // NEGATIVE TEST CASES

    // TODO: Test single opening bracket — "["
    @Test
    public void singleOpeningBracket() {
        String spec = "a single opening bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    // TODO: Test single closing bracket — "]"
    @Test
    public void singleClosingBracket() {
        String spec = "a single closing bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    // TODO: Test reversed brackets — "]["
    @Test
    public void pairOfReversedBrackets() {
        String spec = "pair of reversed brackets returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    // TODO: Test single bracket with other characters "[LaunchCode"
    @Test
    public void singleBracketWithOtherCharacters() {
        String spec = "single bracket with other characters returns false";
        String testData = "[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    // TODO: Test unbalanced brackets among other characters — "Launch]Code["
    @Test
    public void pairOfReversedBracketsAmongCharacters() {
        String spec = "pair of reversed brackets among other characters returns false";
        String testData = "Launch]Code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    // TODO: Test a series of mixed, unbalanced brackets — "[[]][]["
    @Test
    public void multipleMismatchedBrackets() {
        String spec = "several mismatched brackets returns false";
        String testData = "[[]][][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }


    // EDGE CASES

    // TODO: Test string with only characters other than brackets — "LaunchCode"
    @Test
    public void noBracketsReturnsTrue() {
        String spec = "string with no brackets returns true";
        String testData = "LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    // TODO: Test empty string — ""
    @Test
    public void emptyStringReturnsTrue() {
        String spec = "an empty string returns true";
        String testData = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

}
