import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/lucky-numbers-in-a-matrix/

public class LuckyNumbersInMatrix {
    public static void main(String args[]) {
        int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    k = j;
                }
            }
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][k] > max) {
                    max = matrix[j][k];
                }
            }
            if (max == min) {
                res.add(min);
            }
        }

        return res;
    }
}
