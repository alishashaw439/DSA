//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class OddValuesMatrix {
    public static void main(String args[]){
       int m=2; int n=3;
       int[][] indices = {{0,1},{1,1}};
       System.out.println(oddCells(m, n, indices));

    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int r=0;
        int c=1;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<indices.length;j++){
                arr[indices[j][r]][i] +=1;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<indices.length;j++){
                arr[i][indices[j][c]] +=1;
            }
        }
          for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        return count;
        
    }
}
