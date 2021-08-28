import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/create-target-array-in-the-given-order/

public class CreateTargetArray {
    public static void main(String args[])
    {
       int[] nums={0,1,2,3,4};
       int[] index = {0,1,2,2,1};
  
       System.out.println(Arrays.toString(createTargetArray(nums,index)));
        
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> res = new ArrayList<>();
         for(int i=0;i<nums.length;i++){
             res.add(index[i],nums[i]);
         }
         for(int i=0;i<nums.length;i++){
             nums[i] = res.get(i);
         }
         return nums;
     }
}
