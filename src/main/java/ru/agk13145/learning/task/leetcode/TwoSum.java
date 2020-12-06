package ru.agk13145.learning.task.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum/
 */
class TwoSum {

    /**
     * retrieve number elements nums where sum = target
     *
     * @param nums   input array
     * @param target expected value
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        throw new IllegalArgumentException("argument not found");
    }

    /*
    Given nums = [1,2,3,4,5] and target = 8
    Because nums[2] + nums[4] = 8
    then twoSum return {2, 4}
    */
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(a, 8)));
    }
}
