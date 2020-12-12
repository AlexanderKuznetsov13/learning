package ru.agk13145.learning.task.leetcode.addtwonumbers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @BeforeAll
    static void initializationBeforeClaas() {
        System.out.println("Begin test AddTwoNumbers");
    }

    @BeforeEach
    void initBeforeEachFunction() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @DisplayName("Task AddTwoNumbers Test #1")
    @Test
    void testAddTwoNumbers() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));

        ListNode result = addTwoNumbers.addTwoNumbers(listNode1, listNode2);

        int[] actual = new int[11];
        int[] expected = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

        for (int i = 0; i < actual.length; i++) {
            actual[i] = result.val;
            result = result.next;
        }

        assertArrayEquals(expected, actual);

    }
}
