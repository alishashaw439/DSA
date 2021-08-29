//Given a square matrix mat, return the sum of the matrix diagonals.
//Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
public class DiagonalMatrixSum {
    public static void main(String args[]){
       int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
       System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        int j = mat[0].length-1;
        for(int i=0;i<mat.length;i++){
            sum += mat[i][i] + mat[i][j-i];
        }
        if(mat.length % 2 !=0){
                sum -=mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}
