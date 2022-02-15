package ru.agk13145.learning.task.other;


//на входе размерность одинаковая везде
//Input: int[][] arr = {
//                        { 1, 2, 3, 4 }, // i=0 j=1,2,3
//                        { 1, 1, 5, 6 }, // i=1 j=2,3
//                        { 1, 1, 1, 7 }, // i=2 j=3
//                        { 1, 1, 1, 1 }  // i=3 j=4.. skip
//                        };
//Output: 2+3+4+5+6+7 = 27
public class SumElementsUpperDiagonal {

    public int calculate(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++ ){
            for ( int j = i + 1; j < arr[i].length; j++){
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }

}
