package ru.agk13145.learning.task.leetcode;

/**
 * https://leetcode.com/problems/palindrome-number/
 */

public class PalindromeNumber {

    /**
     * determine integer is a palindrome
     * @param x input integer
     * @return
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int n = 0;
        int xTemp = x;
        while (xTemp > 0) {
            xTemp = xTemp / 10;
            n++;
        }
        int[] nums = new int[n];

        for(int i = nums.length - 1; i >= 0; i--) {
            nums[i] = x%10;
            x = x / 10;
        }

        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] != nums[nums.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}