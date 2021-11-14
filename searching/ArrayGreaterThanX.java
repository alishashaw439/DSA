import java.util.Arrays;
//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class ArrayGreaterThanX{
    public static void main(String args[]){
      int[] nums = {0,4,3,0,4};
      System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums) {
        //method 1 O(MN)
        // int x =0;
        //     while(x <= nums.length){
        //         int ans = 0;
        //         for(int n : nums){
        //         if(n >= x){
        //             ans++;
        //         }
                   
        //     }
        //       System.out.println(ans);
        //     if(x == ans){
        //         return x;
        //     }
        //     x++;
        // }
        // return -1;


        //method 2 O(nlogn)

        Arrays.sort(nums);
        int l = 0;
        int h = nums.length;
        
        while(l<=h){
            int mid = l + (h - l)/2;
            
            int count = countElements(mid,nums);
            
            if(count == mid){
                return mid;
            }else if(count < mid ){
                h = mid - 1; 
            }else if(count > mid){
                l = mid + 1;
            }
        }
        return -1;
        
    }   
    public static int countElements(int x,int[] nums){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= x){
                count++;
            }
        }
        return count;
    }
}