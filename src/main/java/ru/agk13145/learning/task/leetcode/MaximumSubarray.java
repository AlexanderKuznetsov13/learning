package ru.agk13145.learning.task.leetcode;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */

public class MaximumSubarray {

    /**
     * find subarray in array nums where sum elements subarray largest
     * @param nums array for find subarray
     * @return largest sum
     */
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = sum;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > 0) {
                if (sum > 0) {
                    sum = sum + nums[i];
                } else {
                    sum = nums[i];
                }
            } else {
                if (sum + nums[i] > 0) {
                    sum = sum + nums[i];
                } else {
                    sum = nums[i];
                }
            }

            if ( max < sum) {
                max = sum;
            }

        }
        return max;
    }


    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSubarray.maxSubArray(nums)); // 6
    }
}