//https://leetcode.com/problems/frequency-of-the-most-frequent-element/
import java.util.Arrays;

public class MaxFrequency {
    public static void main(String args[]){
            int[] nums = {1,4,8,13};
            int k = 5;
            System.out.println(maxFrequency(nums, k));
    }

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = 0;
        int total = 0, result = 0;
        
        while(r < nums.length){
            total += nums[r];
            while(nums[r] * (r - l + 1) - total > k){
                total -= nums[l];
                l++;
            }
            int windowLength = r - l + 1;
             result = Math.max(result,windowLength);
             r++;
        }
        return result;
    }
}
