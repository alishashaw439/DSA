import java.util.Arrays;

public class SearchInRotatedArrayII {
    public static void main(String args[]){
        int[] nums = {2,5,6,0,0,0,1,2,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
    public static boolean search(int[] nums, int target) {
      if (null == nums || 0 == nums.length)
      return false;
    
    int lo = 0;
    int hi = nums.length - 1;
    while (lo <= hi) {

      while (lo < hi && nums[lo] == nums[lo + 1])
        ++lo;
       
      while (lo < hi && nums[hi] == nums[hi - 1])
        --hi;
 
      
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] == target)
        return true;
      
      if (nums[mid] >= nums[lo]) {
        if (target >= nums[lo] && target < nums[mid])
          hi = mid - 1;
        else
          lo = mid + 1;
      } else {
        if (target <= nums[hi] && target > nums[mid])
          lo = mid + 1;
        else
          hi = mid - 1;
      }
    }
    
    return false;
    }
}
