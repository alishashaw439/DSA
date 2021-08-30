import java.util.Arrays;
//Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
public class MatrixObtainByRotation {
    public static void main(String args[]){
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(mat, target));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        
        for(int i=0;i<4;i++){
           mat = rotate(mat);
            if(Arrays.deepEquals(mat,target)){
                return true;
            }
            
        }
        return false;
    }
    public static int[][] rotate(int[][] mat){
        int n = mat.length;
        int[][] ans = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[i][j] = mat[j][n-1-i];
            }
        }
        return ans;
    }
}
