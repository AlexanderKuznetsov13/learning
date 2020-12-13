package ru.agk13145.learning.task.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AddBinaryTest {
    AddBinary addBinary;

    @BeforeAll
    static void initializationBeforeClass() {
        System.out.println("Begin test AddBinary");
    }

    @BeforeEach
    void initBeforeEachFunction() {
        addBinary = new AddBinary();
    }

    @DisplayName("Test #1")
    @Test
    void testAddBinary() {
        String inputA = "1101001";
        String inputB = "100101";
        String expected = "10001110";
        assertArrayEquals(expected.toCharArray(), addBinary.addBinary(inputA, inputB).toCharArray());
    }

}
