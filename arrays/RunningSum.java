import java.util.Arrays;

public class RunningSum {
    public static void main(String args[]){
        int[] nums = { 1, 2, 3, 4};
            System.out.print(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        //method 1
        // int[] ans = new int[nums.length];
        // ans[0] = nums[0];
        // for(int i=1;i<nums.length;i++){
        //     ans[i] = ans[i-1] + nums[i];
        // }
        // return ans;

        //method 2, O(1)
        for(int i=1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }

}
