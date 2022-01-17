//https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicate {
    public static void main(String args[]){
       int[] nums = {1,3,4,2,2};
       System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        //method 1

        // int tortoise = nums[0];
        // int hare = nums[0];
        //     do{
        //         tortoise = nums[tortoise];
        //         hare = nums[nums[hare]];
                
        //     }
        //     while(tortoise !=hare);
            
        //     tortoise = nums[0];
        //     while(tortoise !=hare){
        //         tortoise=nums[tortoise];
        //         hare=nums[hare];
        //     }
        //     return hare;

        //methdo 2

        int l = 0;
        int h = nums.length;
        

        int duplicate = -1;
        
        while(l<=h){
            int mid = l + (h-l)/2;
            int count = 0;
            for(int num : nums){
                if(num <= mid){
                    count++;
                }
            }
            
            if(count > mid){
                duplicate = mid;
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return duplicate;
        }
}
