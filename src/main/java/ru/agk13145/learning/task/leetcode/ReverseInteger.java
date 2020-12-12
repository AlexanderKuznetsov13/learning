package ru.agk13145.learning.task.leetcode;
/**
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {

    /**
     * retrieve deployed integer
     * @param x integer for reverse
     * @return
     */
    public int reverse(int x) {
        int reverseX = 0;
        while (x != 0) {
            int n = x%10;
            x = x/10;

            if (reverseX > (Integer.MAX_VALUE-Math.abs(n))/10) {
                return 0;
            }
            if (reverseX < (Integer.MIN_VALUE+Math.abs(n))/10) {
                return 0;
            }

            reverseX = reverseX * 10 + n;

        }
        return reverseX;
    }

}
