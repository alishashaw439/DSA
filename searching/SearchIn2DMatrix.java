public class SearchIn2DMatrix {
    public static void main(String args[]){
       int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
       int target = 11;
       System.out.println(searchMatrix(matrix,target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
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
                return true;
            }if(target < matrix[i][j]){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
