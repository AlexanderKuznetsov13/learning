package ru.agk13145.learning.task.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TwoSumTest {

    TwoSum twoSum;

    // function start before test
    @BeforeAll
    static void initializationBeforeClass() {
        System.out.println("Begin test TwoSum");
    }
    // function start before each tests
    @BeforeEach
    void initBeforeEachFunction() {
        twoSum = new TwoSum();
    }

    @DisplayName("Test TwoSum")
    @Test
    void testTwoSum() {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int target = 4;
        int[] result = new int[]{0, 2};
        assertArrayEquals(result, twoSum.twoSum(nums, target));
    }

    @DisplayName("Test TwoSum Throw Exception")
    @Test
    void testTwoSumThrowException() {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int target = 80;
        int[] result = new int[]{0, 1};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            twoSum.twoSum(nums, target);
        });
    }
}