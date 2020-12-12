package ru.agk13145.learning.task.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountAndSayTest {

    CountAndSay countAndSay = new CountAndSay();

    @BeforeAll
    static void initializationBeforeClass() {
        System.out.println("Begin test CountAndSay");
    }

    @BeforeEach
    void initBeforeEachFunction() {
        countAndSay = new CountAndSay();
    }

    @DisplayName("Test #1")
    @Test
    void testCountAndSay() {
        //1.     1
        //2.     11
        //3.     21
        //4.     1211
        //5.     111221
        int input = 3;
        char[] expected = new char[]{'2', '1'};
        assertArrayEquals(expected, countAndSay.countAndSay(3).toCharArray());
    }

}
