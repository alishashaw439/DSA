//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//Input: accounts = [[1,5],[7,3],[3,5]]
//Output: 10

public class RichestCustWealth {
        public static void main(String args[]){
            int[][] nums = {{1,2,3},{3,2,1}};
            System.out.println(maximumWealth(nums));
        }
        public static int maximumWealth(int[][] accounts) {
            int max=0;
            for(int i=0;i<accounts.length;i++){
                int sum=0;
                for(int j=0;j<accounts[i].length;j++){
                    sum += accounts[i][j];
                    max= Math.max(sum,max);
                }
            }
            return max;
        }
}
