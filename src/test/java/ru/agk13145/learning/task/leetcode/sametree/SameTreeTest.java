package ru.agk13145.learning.task.leetcode.sametree;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SameTreeTest {
    SameTree sameTree;

    @BeforeAll
    static void initializationBeforeClass() {
        System.out.println("Begin test SameTree");
    }

    @BeforeEach
    void initBeforeEachFunction() {
        sameTree = new SameTree();
    }

    @DisplayName("Task SameTree Test #1")
    @Test
    void testSameTreeTrue() {
        TreeNode treeNode1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode treeNode2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertTrue(sameTree.isSameTree(treeNode1, treeNode2));
    }

    @DisplayName("Task SameTree Test #2")
    @Test
    void testSameTreeFalse() {
        TreeNode treeNode1 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode treeNode2 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        assertFalse(sameTree.isSameTree(treeNode1, treeNode2));
    }
}
