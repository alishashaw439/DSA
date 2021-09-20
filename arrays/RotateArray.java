import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/

class RotateArray{
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n<= 1 || k<0){
            return;
        }
        //method 1

//        for(int i=0;i<k;i++){
//            rotateByOne(nums);
//        }
//     }
    
//     public void rotateByOne(int[] array){
//         int last = array[array.length-1];
//         for(int i=array.length-2;i>=0;i--){
//             array[i+1] = array[i];
//         }
//         array[0] = last;
        
        
        k = k%n;
        int[] temp = new int[k];
        // storing last k digits in temp array
        for(int i= 0;i<k;i++){
            temp[i] = nums[n-k+i];
        }
        //shifting first n-k to the end 
        for(int i=n-k-1;i>=0;i--){
            nums[i+k] = nums[i];
        }
        //copying the temp array to nums array
        for(int i=0;i<k;i++){
            nums[i] = temp[i];
        }
    }
}