import java.util.Arrays;

//https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZeroes {
    public static void main(String args[]) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void setZeroes(int[][] matrix) {
        // method 1 : O(M + N) SPACE, O(M*N)

        // int row = matrix.length;
        // int col = matrix[0].length;
        // Set<Integer> row_mark = new HashSet<Integer>();
        // Set<Integer> col_mark = new HashSet<Integer>();

        // for(int i=0;i<row;i++){
        // for(int j=0;j<col;j++){
        // if(matrix[i][j]==0){
        // row_mark.add(i);
        // col_mark.add(j);
        // }
        // }
        // }

        // for(int i=0;i<row;i++){
        // for(int j=0;j<col;j++){
        // if(row_mark.contains(i) || col_mark.contains(j)){
        // matrix[i][j]=0;
        // }
        // }

        // method 2, O(1) SPACE, O(M*N)
        Boolean rowsZero = false;
        int rowsLen = matrix.length;
        int colsLen = matrix[0].length;

        for (int i = 0; i < rowsLen; i++) {
            for (int j = 0; j < colsLen; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    if (i > 0) {
                        matrix[i][0] = 0;
                    } else {
                        rowsZero = true;
                    }
                }
            }
        }

        for (int i = 1; i < rowsLen; i++) {
            for (int j = 1; j < colsLen; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int i = 0; i < rowsLen; i++) {
                matrix[i][0] = 0;
            }
        }
        if (rowsZero) {
            for (int j = 0; j < colsLen; j++) {
                matrix[0][j] = 0;
            }
        }

    }
}
