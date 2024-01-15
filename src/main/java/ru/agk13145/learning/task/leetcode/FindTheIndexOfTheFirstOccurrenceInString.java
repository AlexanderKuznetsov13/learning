package ru.agk13145.learning.task.leetcode;

public class FindTheIndexOfTheFirstOccurrenceInString {
    public int strStr(String haystack, String needle) {
        int haylength = haystack.length();
        int needlelength = needle.length();
        if (haylength < needlelength)
            return -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j))
                j++;
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FindTheIndexOfTheFirstOccurrenceInString f1 = new FindTheIndexOfTheFirstOccurrenceInString();
        System.out.println(f1.strStr("leetcode", "leeto")); // -1
        System.out.println(f1.strStr("sadbutsad", "but")); // 3
    }
}
