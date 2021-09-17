import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/
public class ProductofArrayExceptSelf {
    public static void main(String args[]){
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        //method 1, 

        //       int N = nums.length;
        //       int[] leftP = new int[N];
        //       int[] rightP = new int[N];
        //       int[] answer = new int[N];
                
        //       leftP[0] = 1;
        //       rightP[N-1] =1;
        //       for(int i=1;i<N;i++){
        //           leftP[i] = nums[i-1] * leftP[i-1];
        //       }
                
        //      for(int i=N-2;i>=0;i--){
        //          rightP[i] = nums[i+1] * rightP[i+1];
        //       }
                
        //         for(int i=0;i<N;i++){
        //             answer[i] = leftP[i] * rightP[i];
        //         }
        //         return answer;
                
        //method 2, O(1) space
              int N = nums.length;
              int[] answer = new int[N];
              int right = 1;
                
              answer[0] = 1;
              for(int i=1;i<N;i++){
                  answer[i] = nums[i-1] * answer[i-1];
              }
                
             for(int i=N-1;i>=0;i--){
                 answer[i] = answer[i] * right;
                 right = right * nums[i];
              }
                
                return answer;
            }
}
