//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
    public static void main(String args[]) {
         int[] nums = {1,3,5,6};
         int target = 5;
         //int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {

        int n = nums.length;

        if (target > nums[n - 1]) {
            return n;
        }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;

            }

        }
        return low;
    }
}
