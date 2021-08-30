import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String args[]){
       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
       System.out.println(Arrays.deepToString(transpose(matrix)));
    }
    public static int[][] transpose(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int[][] ans = new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
