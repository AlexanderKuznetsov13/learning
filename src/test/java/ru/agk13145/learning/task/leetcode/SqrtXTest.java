package ru.agk13145.learning.task.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtXTest {
    SqrtX sqrtX;

    @BeforeAll
    static void initializationBeforeClass() {
        System.out.println("Begin test SqrtX");
    }

    @BeforeEach
    void initBeforeEachFunction() {
        sqrtX = new SqrtX();
    }

    @DisplayName("Task SqrtX Test #1")
    @Test
    void testSqrtX() {
        int input = 6325225;
        int expected = 2515;
        assertEquals(expected, sqrtX.mySqrt(input));
    }

    @DisplayName("Task SqrtX Test #2")
    @Test
    void testSqrtX2() {
        int input = 16;
        int expected = 4;
        assertEquals(expected, sqrtX.mySqrt(input));
    }
}
