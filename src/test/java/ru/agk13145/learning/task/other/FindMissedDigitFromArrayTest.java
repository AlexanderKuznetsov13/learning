package ru.agk13145.learning.task.other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FindMissedDigitFromArrayTest {

    @DisplayName("test ")
    @Test
    void testArray() {
        int[] arr = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> FindMissedDigitFromArray.findMissed(arr));
    }

    @DisplayName("test testArrayMissedDigit ")
    @Test
    void testArrayMissedDigit() {
        int[] arr = new int[] {0, 2};
        int expected = 1;
        Assertions.assertEquals(FindMissedDigitFromArray.findMissed(arr), expected);
    }

    @DisplayName("test testArrayMissedDigit ")
    @Test
    void testArrayMissedDigit123() {
        int[] arr = new int[] {0, 1, 3};
        int expected = 2;
        Assertions.assertEquals(FindMissedDigitFromArray.findMissed(arr), expected);
    }

    @DisplayName("test testArrayMissedDigit ")
    @Test
    void testArrayMissedDigit1234() {
        int[] arr = new int[] {1, 4, 3, 0};
        int expected = 2;
        Assertions.assertEquals(FindMissedDigitFromArray.findMissed(arr), expected);
    }

}