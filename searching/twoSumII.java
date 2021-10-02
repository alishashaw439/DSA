import java.util.Arrays;

public class twoSumII {
    public static void main(String args[]){
        int[] sortedArray = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(sortedArray, target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        // for(int i=0;i<numbers.length;i++){
        //    for(int j=0;j<numbers.length;j++){
        //        if(i!=j && numbers[i]+numbers[j] ==target){
        //            ans[0] = i+1;
        //            ans[1] = j+1;
        //            return ans;
        //        }
        //    }
        // }
        
        int start = 0;
        int end = numbers.length-1;
        
        while(start < end){
            if(numbers[start] + numbers[end] == target){
                ans[0] = start+1;
                ans[1] = end+1;
                return ans;
            }else if(numbers[start]+numbers[end] > target){
                end--;
            }else{
                start++;
            }
        }
        return ans;
    }
}
