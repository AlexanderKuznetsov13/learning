package ru.agk13145.learning.task.other;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumElementsUpperDiagonalTest {

    @DisplayName("Test #1")
    @Test
    void test1() {
        int[][] arr = new int[][]{
                { 1, 2, 3, 4 },
                { 1, 1, 5, 6 },
                { 1, 1, 1, 7 },
                { 1, 1, 1, 1 }
        };
        int expected = 27;

        SumElementsUpperDiagonal a = new SumElementsUpperDiagonal();

        assertEquals(expected, a.calculate(arr));
    }
}
