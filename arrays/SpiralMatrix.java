import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/

public class SpiralMatrix {
    public static void main(String args[]){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        //i =0    i=0  i=0          i=1   i=2       i=2   i=2        i=1
        // j = 0  j=1   j=2         j=2    j=2      j=1   j=0        j=0
        
        List<Integer> res = new ArrayList<>();
        int rowN = matrix.length;
        int colN = matrix[0].length;
        int left = 0;
        int right = colN -1;
        int down = rowN-1;
        int up = 0;
        
        while(res.size() < rowN * colN){
            //from left to right
            for(int i = left;i<=right;i++){
                res.add(matrix[up][i]);
            }
            //from up to down
            for(int i = up+1;i<=down;i++){
                res.add(matrix[i][right]);
            }
            //not in the same row
            if(up!=down){
                //right to left
                for(int i=right-1;i>=left;i--){
                    res.add(matrix[down][i]);
                }
            }
            //not in the same column
            if(left!=right){
                //from down to up
                for(int i=down-1;i>up;i--){
                    res.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            up++;
            down--;
        }
        return res;
        
    }
}
