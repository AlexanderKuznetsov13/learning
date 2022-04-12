package ru.agk13145.learning.task.other;

import java.io.BufferedReader;

//дан массив N-1 числами 0..N но одно пропущено, надо его найти
public class FindMissedDigitFromArray {

    public static int findMissed(int[]arr) {
        int sum = 0;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                idx = i;
            } else {
                sum += arr[i];
            }
        }

// the total sum of numbers between 1 and arr.length.
        int total = (arr.length + 1) * arr.length / 2;

        System.out.println("missing number is: " + (total - sum) + " at index " + idx);
        return sum;
    }


    public static void main (String[] args){
       int [] arr= {1,2,3,4,6,7,8,9};
       findMissed(arr);
    }


}
