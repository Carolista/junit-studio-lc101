package test;

import org.junit.Test;
import static org.junit.Assert.*;

import main.BalancedBrackets;

public class BalancedBracketsTest {

    // POSITIVE TEST CASES

    // Sample test from instructions, refactored to use constructor with message
    @Test
    public void singlePairOfBrackets() {
        String message = "a single set of balanced brackets returns true";
        String testData = "[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(message, result);
    }

    // TODO: Test balanced brackets in front of other characters — "[]LaunchCode"
    @Test
    public void singleBracketsBeforeOtherCharacters() {
        String message = "balanced brackets in front of other characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(message, result);
    }

    // TODO: Test balanced brackets around other characters — "[LaunchCode]"
    @Test
    public void singleBracketsAroundOtherCharacters() {
        String message = "balanced brackets around other characters returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(message, result);
    }

    // TODO: Test balanced brackets within other characters — "Launch[Code]"
    @Test
    public void singleBracketsAmongOtherCharacters() {
        String message = "balanced brackets among other characters returns true";
        String testData = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(message, result);
    }

    // TODO: Test multiple consecutive pairs of balanced brackets — "[][][]"
    @Test
    public void tripleBalancedBrackets() {
        String message = "three consecutive pairs of brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(message, result);
    }

    // TODO: Test multiple nested balanced brackets — "[[[]]]"
    @Test
    public void tripleNestedBalancedBrackets() {
        String message = "three nested pairs of brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(message, result);
    }


    // NEGATIVE TEST CASES

    // TODO: Test single opening bracket — "["
    @Test
    public void singleOpeningBracket() {
        String message = "a single opening bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(message, result);
    }

    // TODO: Test single closing bracket — "]"
    @Test
    public void singleClosingBracket() {
        String message = "a single closing bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(message, result);
    }

    // TODO: Test reversed brackets — "]["
    @Test
    public void reversedBrackets() {
        String message = "a reversed sets of brackets returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(message, result);
    }

    // TODO: Test single bracket with other characters "[LaunchCode"
    @Test
    public void singleBracketWithOtherCharacters() {
        String message = "a single opening bracket with other characters returns false";
        String testData = "[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(message, result);
    }

    // TODO: Test unbalanced brackets among other characters — "Launch]Code["
    @Test
    public void unbalancedBracketsAmongOtherCharacters() {
        String message = "unbalanced brackets among other characters returns false";
        String testData = "Launch]Code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(message, result);
    }

    // TODO: Test a series of mixed, unbalanced brackets — "[[]][]["
    @Test
    public void mixOfUnbalancedBrackets() {
        String message = "a mix of unbalanced brackets returns false";
        String testData = "[[]][][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(message, result);
    }


    // EDGE CASES

    // TODO: Test string with only characters other than brackets — "LaunchCode"
    @Test
    public void stringOfCharactersWithoutBrackets() {
        String message = "a string of characters without brackets returns true";
        String testData = "LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(message, result);
    }

    // TODO: Test empty string — ""
    @Test
    public void emptyString() {
        String message = "an empty string returns true";
        String testData = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(message, result);
    }

}
