package ru.agk13145.learning.task.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheIndexOfTheFirstOccurrenceInStringTest {
    FindTheIndexOfTheFirstOccurrenceInString findTheIndexOfTheFirstOccurrenceInString;
    @BeforeAll
    static void initializationBeforeClass() {
        System.out.println("Begin test FindTheIndexOfTheFirstOccurrenceInString");
    }

    @BeforeEach
    void initBeforeEachFunction() {
        findTheIndexOfTheFirstOccurrenceInString = new FindTheIndexOfTheFirstOccurrenceInString();
    }

    @DisplayName("Test #1")
    @Test
    void testfindTheIndexOfTheFirstOccurrenceInString(){
        String haystack = "feeltog";
        String needle = "tog";
        Integer expected = 4;
        assertEquals(expected, findTheIndexOfTheFirstOccurrenceInString.strStr(haystack, needle));
    }

    @DisplayName("Test #2")
    @Test
    void testfindTheIndexOfTheFirstOccurrenceInString2(){
        String haystack = "logger";
        String needle = "get";
        Integer expected = -1;
        assertEquals(expected, findTheIndexOfTheFirstOccurrenceInString.strStr(haystack, needle));
    }
}