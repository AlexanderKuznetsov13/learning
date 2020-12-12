package ru.agk13145.learning.task.leetcode;
/**
 * https://leetcode.com/problems/count-and-say/
 */

public class CountAndSay {

    /**
     * generate n count-and-say sequence and return nTh as a string
     * each sequence describe previous sequence:
     * 1 - ever 1, here "one 1"
     * 11 - describe previous sequence "one 1" as a integer, "two 1"
     * 21 - describe previous sequence "two 1" as a integer, "one 2 one 1"
     * 1211 - describe previous sequence "one 2 one 1" as a integer, "one 1 one 2 two 1"
     * 111221 - .........
     * ............
     * @param n count generate count-and-say sequence
     * @return string which in nTh place
     */
    public String countAndSay(int n) {
        if (n > 1) {
            String s = countAndSay(n - 1);

            StringBuffer result = new StringBuffer();
            char[] c = s.toCharArray();
            int count = 1;
            for (int i = 0; i < c.length - 1; i++) {
                if (c[i] == c[i + 1]) {
                    count++;
                } else {
                    result.append(String.valueOf(count) + c[i]);
                    count = 1;
                }
            }

            result.append(String.valueOf(count));
            result.append(c[c.length - 1]);

            return result.toString();

        } else {
            return "1";
        }
    }

    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        for (int i = 1; i <= 30; i++) {
            System.out.println(countAndSay.countAndSay(i));
        }
    }
}
