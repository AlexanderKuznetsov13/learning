package ru.agk13145.learning.task.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlusOneTest {
    PlusOne plusOne;

    @BeforeAll
    static void initializationBeforeClass() {
        System.out.println("Begin test PlusOne");
    }

    @BeforeEach
    void initBeforeEachFunction() {
        plusOne = new PlusOne();
    }

    @DisplayName("Test #1")
    @Test
    void testPlusOne() {
        int[] actual = new int[] {3, 5, 4, 7, 3};
        int[] expected = new int[] {3, 5, 4, 7, 4};
        assertArrayEquals(expected, plusOne.plusOne(actual));
    }

}
