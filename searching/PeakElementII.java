//https://leetcode.com/problems/find-a-peak-element-ii/
import java.util.Arrays;

public class PeakElementII {
    
    public static void main(String args[]){
       int[][] mat = {{10,20,15},{21,30,14},{7,16,32}};
       System.out.println(Arrays.toString(findPeakGrid(mat))); 
    }
    public static int[] findPeakGrid(int[][] mat) {
        int startRow = 0;
        int endRow = mat.length - 1;
        
        while(startRow <= endRow){
            int middleRow = startRow + (endRow - startRow)/2;
            

            int rowMax = findMaxRow(mat[middleRow],mat[middleRow].length - 1);
            
            if(middleRow == 0){
                if(mat[middleRow][rowMax] > mat[middleRow + 1][rowMax]){
                    return new int[]{middleRow,rowMax};
                }
            }
            
            if(middleRow == mat.length - 1){
                if(mat[middleRow][rowMax] > mat[middleRow - 1][rowMax]){
                    return new int[]{middleRow,rowMax};
                }
            }
            
            if(mat[middleRow][rowMax] > mat[middleRow + 1][rowMax] 
               && mat[middleRow][rowMax] > mat[middleRow - 1][rowMax]){
                return new int[]{middleRow,rowMax};
            }
            
            if(mat[middleRow][rowMax] < mat[middleRow + 1][rowMax]){
                startRow = middleRow + 1;
            }else{
                endRow = middleRow - 1;
            }
            

        }
        
    return new int[]{-1,-1};
        
    }
    
    static int findMaxRow(int[] arr,int n){
        int max = 0;
        
        for(int i=0;i<=n;i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
