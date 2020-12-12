package ru.agk13145.learning.task.leetcode;

import java.util.Arrays;

public class PlusOne {
    /**
     * array digits turn into a integer, increment this integer and retrieve back array digits and return his
     * @param digits input array digits for job
     * @return array digits
     */
    public int[] plusOne(int[] digits) {

        int i = digits.length - 1;
        while(i >= 0 && (digits[i] + 1) / 10 == 1) {
            digits[i] = 0;
            i--;
        }

        int[] result;

        if(i < 0) {
            result = new int[digits.length + 1];
            result[0] = 1;
            for (int j = 1; j < result.length; j++) {
                result[j] = digits[j -  1];
            }
        } else {
            digits[i] = digits[i] + 1;
            result = Arrays.copyOf(digits, digits.length);;
        }

        return result;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] digits = new int[] {1, 2, 3};
        plusOne.plusOne(digits);

        for (int i : digits) {
            System.out.print(i);
        }
    }

}
