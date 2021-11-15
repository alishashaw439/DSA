import java.util.Arrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastPos{
    public static void main(String args[]){
            int[] nums = {5,7,7,8,8,10};
            int target = 8;
            System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        //method 1 

        //         int N = nums.length;
        //         List<Integer> indexs = new ArrayList<>();
        //         int[] answer = {-1,-1};
        //         for(int i=0;i<N;i++){
        //             if(nums[i] == target){
        //                 indexs.add(i);
        //         int min=indexs.get(0), max=indexs.get(0);
        //         for(int j=0;j<indexs.size();j++){
        //             if(indexs.get(j) < min){
        //                 min = indexs.get(j);
        //             }
        //             if(indexs.get(j) > max){
        //                 max =  indexs.get(j);
        //             }
        //         }
              
        //      //System.out.println(min);
        //         answer[0] = min;
        //         answer[1] = max;
        //              }
        //         }
                
        //         return answer;
                
                
                
                //method 2
                int[] ans = new int[2];
                int first = firstIndex(nums,target);
                int second = lastIndex(nums,target);
                
                ans[0] = first;
                ans[1] = second;
                
                return ans;
           
            }
        
            
            public static int firstIndex(int[] nums,int target){
                int index = -1;
                int l = 0;
                int h = nums.length - 1;
                while(l<=h){
                    int mid = l + (h-l)/2;
                    
                    if(nums[mid] >= target){
                        h = mid - 1;
                    }else{
                        l = mid + 1;
                    }
                    
                    if(nums[mid] == target){
                        index = mid;
                    }
                }
                return index;
            }
            public static int lastIndex(int[] nums,int target){
                int index = -1;
                int l = 0;
                int h = nums.length - 1;
                while(l<=h){
                    int mid = l + (h-l)/2;
                    
                    if(nums[mid] <= target){
                        l = mid + 1;
                    }else{
                        h = mid - 1;
                    }
                    
                    if(nums[mid] == target){
                        index = mid;
                    }
                }
                return index;
            }
        
}