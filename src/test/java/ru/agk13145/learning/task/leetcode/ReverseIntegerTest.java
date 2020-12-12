package ru.agk13145.learning.task.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {
    ReverseInteger reverseInteger;

    @BeforeAll
    static void initializationBeforeClass() {
        System.out.println("Begin test ReverseInteger");
    }

    @BeforeEach
    void initBeforeEachFunction() {
        reverseInteger = new ReverseInteger();
    }

    @DisplayName("Test #1")
    @Test
    void testReverseInteger() {
        int x = 3461;
        int excepted = 1643;
        assertEquals(excepted, reverseInteger.reverse(x));
    }


}
