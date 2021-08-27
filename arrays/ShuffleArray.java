import java.util.Arrays;
//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].

public class ShuffleArray {
    public static void main(String args[]) {
        int[] nums = { 2, 5, 1, 3, 4 ,7 };
        int n=3;
        System.out.print(Arrays.toString(shuffle(nums,n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int j = n;
        for(int i=0;i<n;i++){
            ans[i*2] = nums[i];
            ans[2*i+1] = nums[j++];
        }
        return ans;
    }
}
