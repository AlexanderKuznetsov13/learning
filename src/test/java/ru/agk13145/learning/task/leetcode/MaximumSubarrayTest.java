package ru.agk13145.learning.task.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarrayTest {

    MaximumSubarray maximumSubarray;

    @BeforeAll
    static void initializationBeforeClass() {
        System.out.println("Begin test MaximumSubarray");
    }

    @BeforeEach
    void initBeforeEachFunction() {
        maximumSubarray = new MaximumSubarray();
    }

    @DisplayName("Test #1")
    @Test
    void testMaximumSubarray() {
        int[] nums = new int[]{-2, 3, 4, 5, -5, 9};
        int expected = 16;
        assertEquals(expected, maximumSubarray.maxSubArray(nums));
    }
}
