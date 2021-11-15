public class SingleElement {
    //https://leetcode.com/problems/single-element-in-a-sorted-array/
    public static void main(String args[]){
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        //         HashMap<Integer,Integer> map = new HashMap<>();
        //         for(int i=0;i<nums.length;i++){
        //             if(map.containsKey(nums[i])){
        //                 map.put(nums[i],map.get(nums[i]) + 1 );
        //             }else{
        //                 map.put(nums[i],1);
        //             }
        //         }
                
        //         for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //             if(entry.getValue() == 1){
        //                 return entry.getKey();
        //             }
        //         }
        //         return -1;
                
                int l =0;
                int h = nums.length - 1;
             
                if(h == 0){
                    return nums[0];
                }
               else if(nums[0] != nums[1]){
                    return nums[0];
                }else if(nums[h] != nums[h-1]){
                    return nums[h];
                }
                while(l <= h){
                    int mid = l + (h - l)/2;
                    if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid+1]){
                        return nums[mid];
                    }else if((mid % 2 == 0) && nums[mid] == nums[mid + 1] || 
                             (mid % 2) == 1 && nums[mid] == nums[mid - 1]
                            ){
                        l = mid + 1;
                    }else{
                        h = mid - 1;
                    }
                    
                }
                return -1; 
            }
}
