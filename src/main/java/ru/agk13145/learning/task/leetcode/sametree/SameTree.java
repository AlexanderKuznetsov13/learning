package ru.agk13145.learning.task.leetcode.sametree;
/**
 * https://leetcode.com/problems/same-tree/
 */
public class SameTree {
    /**
     * check two binary trees the same or not
     * @param p first binary tree
     * @param q second binary tree
     * @return true if trees the same and false if not
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.left != null) {
            if (q.left != null) {
                if (!isSameTree(p.left, q.left)) {
                    return false;
                }

            } else {
                return false;
            }
        } else {
            if (q.left != null) {
                return false;
            }
        }

        if (p.right != null) {
            if (q.right != null) {

                if (!isSameTree(p.right, q.right)) {
                    return false;
                }

            } else {
                return false;
            }
        } else {
            if (q.right != null) {
                return false;
            }
        }
        if (p.val == q.val) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode treeNode2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        SameTree sameTree = new SameTree();
        System.out.println(sameTree.isSameTree(treeNode1, treeNode2));

        treeNode1 = new TreeNode(1, new TreeNode(2), null);
        treeNode2 = new TreeNode(1, null, new TreeNode(2));
        System.out.println(sameTree.isSameTree(treeNode1, treeNode2));

        treeNode1 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        treeNode2 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        System.out.println(sameTree.isSameTree(treeNode1, treeNode2));
    }

}
