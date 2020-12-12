package ru.agk13145.learning.task.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberTest {

    PalindromeNumber palindromeNumber;

    @BeforeAll
    static void initializationBeforeClass() {
        System.out.println("Begin test PalindromeNumber");
    }

    @BeforeEach
    void initBeforeEachFunction() {
        palindromeNumber = new PalindromeNumber();
    }

    @DisplayName("Test #1")
    @Test
    void testPalindromeNumber() {
        int x = 121;
        boolean expected = true;
        assertTrue(palindromeNumber.isPalindrome(x));
    }
}
