//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class CountNegativeInMatrix{
    public static void main(String args[]){
       int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
       System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        
        //  4 3 2 -1
        //  3 2 1 -1
        //  1 1 -1 -2
        // -1 -1 -2 -3
         
         int i=0;
         int j=grid[0].length-1;
         int count =0;
         while(i<grid.length && j>= 0){
             if(grid[i][j] < 0){
                 count += grid.length - i;
                 j--;
             }else{
                 i++;
             }
         }
         return count;
     }
}