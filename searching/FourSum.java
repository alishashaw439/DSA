import java.util.*;

public class FourSum {
    public static void main(String args[]){
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        

        List<List<Integer>> res = new ArrayList<>();
        if(nums.length==0 || nums==null )return res;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                
                int left = j+1;
                int right = nums.length -1;
                int sum = nums[j] + nums[i];
                int find = target - sum; 
                
                while(left < right){
                     int two_sum = nums[left] + nums[right];
                    if(find > two_sum ){
                        left++;
                    }else if(find < two_sum){
                        right--;
                    }else{
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        res.add(list);
                        
       while(left < right && nums[left] == list.get(2)) {
             left++;
         }
         while(left < right && nums[right] == list.get(3)) {
             right--;
         }
         
    }
                    

                }
                while(j+1 < nums.length && nums[j] == nums[j+1])
                    j++;
               
                
            }
             while(i+1 <nums.length && nums[i] == nums[i+1])
                 i++;
        }
        return res;
        
    }
}
