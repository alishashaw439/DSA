import java.util.Arrays;

//https://leetcode.com/problems/search-a-2d-matrix/
public class SearchIn2DMatrix {
    public static void main(String args[]){
       int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
       int target = 7;
       System.out.println(Arrays.toString(binarySearch(matrix,target)));
    }

    public static int[] searchMatrix(int[][] matrix, int target) {
        int rn = matrix.length;
        int cn = matrix[0].length;
        
//         for(int i=0;i<rn;i++){
//             for(int j=0;j<cn;j++){
//                 if(target==matrix[i][j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
        int i=0,j=cn-1;
        while(i<rn && j>=0){
            if(matrix[i][j]==target){
                return new int[]{i,j};
            }if(target < matrix[i][j]){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] binarySearch(int[][] matrix, int target){

        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows == 1){
            return singleBS(0,0,cols - 1,matrix,target);
        }
        int rowStart = 0;
        int rowEnd = rows - 1;
        int colsMid = cols/2;
        
        //run loop until 2 rows are remaining
        while(rowStart < (rowEnd - 1)){
             int mid = rowStart + (rowEnd - rowStart)/2;
             if(matrix[mid][colsMid] == target){
                 return new int[]{mid,colsMid};
             }else if(matrix[mid][colsMid] > target){
                       rowEnd = mid;
             }else{
                 rowStart = mid;
             }
        }
       
         //while 2 rows are remaining
         //check if present in the columns of 2 rows

         if(matrix[rowStart][colsMid] == target){
             return new int[]{rowStart,colsMid};
         }
         if(matrix[rowStart+1][colsMid] == target){
             return new int[]{rowStart + 1,colsMid};
         }


         //search in first half
         if(target <= matrix[rowStart][colsMid - 1]){
            return singleBS(rowStart,0,colsMid-1,matrix,target);
         }
         //search in second half
         if(target >= matrix[rowStart][colsMid+1] && target <= matrix[rowStart][cols - 1]){
            return singleBS(rowStart,colsMid+1,cols-1,matrix,target);
         }
         
         //search in third half
         if(target <= matrix[rowStart +1][colsMid -1]){
            return singleBS(rowStart+1,0,colsMid - 1,matrix,target);
         }

         //search in 4th half
         if(target >= matrix[rowStart+1][colsMid+1] && target <= matrix[rowStart+1][cols-1]){
            return singleBS(rowStart+1,colsMid+1,cols-1,matrix,target);
         }
        return new int[]{-1,-1};
    }

    public static int[] singleBS(int rows,int start,int end, int[][] matrix,int target) {
        while(start < end){
            int mid=start + (end - start)/2;
            if(matrix[rows][mid] == target){
                return new int[]{rows,mid};
            }else if(target > matrix[rows][mid]){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        



        return new int[]{-1,-1};
    }
}
