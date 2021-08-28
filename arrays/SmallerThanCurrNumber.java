import java.util.Arrays;

public class SmallerThanCurrNumber {
    public static void main(String args[])
    {
       int nums[]={8,1,2,2,3};
  
       System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
        
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        //method 1 , time -> O(n^2)
        // int[] result = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[j] < nums[i]){
        //             result[i] += 1; 
        //         }
        //     }
        // }
        // return result;

        //method 2, time -> O(n)
        int[] count = new int[101];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        for(int i=1;i<count.length;i++){
            count[i] += count[i-1];
        }
        for(int i=0;i<nums.length;i++){
            int position = nums[i];
            if(position == 0 ){
                nums[i] = 0;
            }else{
                nums[i] = count[position-1];
            }
        }
        return nums;
    }
}
