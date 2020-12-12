package ru.agk13145.learning.task.leetcode;
/**
        * https://leetcode.com/problems/sqrtx/
        */
public class SqrtX {
 /**
        public int mySqrt(int x) {
        int y = 0;
        while ((long)y * y <= x) {
            y++;
        }
        return (y - 1);
    }
    */

    /**
     * Compute square root integer
     * @param x input integer
     * @return square root of x
     */
    public int mySqrt(int x) {
        int i = 5;
        int[] n = new int[5];
        while (x / 100 > 0){
            i--;
            n[i] = x % 100;
            x = x / 100;
        }
        int y = 1;
        while( y * y <= x) {
            y++;
        }
        y--;
        int mod = x - (y * y);

        for (; i < n.length; i++) {
            for (int j = 0; j <= 10; j++) {
                if ((y*2*10 + j) * j > mod*100 + n[i]) {
                    j--;
                    mod = mod*100 + n[i] - ((y*2*10 + j) * j);
                    y = y * 10 + j;
                    break;
                }
            }
        }
        return y;
    }

    public static void main(String[] args) {
        SqrtX sqrtX = new SqrtX();
        System.out.println(sqrtX.mySqrt(101761));
        System.out.println(sqrtX.mySqrt(4));
    }
}
