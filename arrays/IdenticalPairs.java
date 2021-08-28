public class IdenticalPairs {
    public static void main(String args[])
    {
       int nums[]={1,2,3,1,1,3};
  
       System.out.println(identicalPairs(nums));
        
    }
    public static int identicalPairs(int[] nums){
        //method 1,  time -> O(n^2), space O(1)
        //  int count =0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if((nums[i] == nums[j]) && i<j){
        //             count++;
        //         }
        //     }
        // } 

        //method 2, time -> O(n) , space O(n), cal the frequency and return the number of pairs
        int[] arr = new int[101];
        int count=0;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int n:arr){
            count += n*(n-1)/2;
        }
        return count;
    }
}
