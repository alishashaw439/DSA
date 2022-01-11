public class SearchInRotatedArray {
    public static void main(String args[]){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        while(l<=h){
            int mid = l + (h-l)/2;
            
             if(nums[mid] == target){
                 return mid;
             }
            
            if(nums[l] <= nums[mid]){
                if(target >= nums[l] && target <= nums[mid]){
                    h = mid - 1;
                }else{
                    l = mid + 1;
                }
            }else{
                if(target >= nums[mid] && target <= nums[h]){
                    l = mid + 1;
                }else{
                     h = mid - 1;
                }
            }
        }
        return -1;
    }
}
