//https://leetcode.com/problems/minimum-absolute-sum-difference/
import java.util.*;

public class MinSumDiff {
    public static void main(String args[]){
        int[] nums1 = {1,7,5};
        int[] nums2 = {2,3,5};
         int ans = minAbsoluteSumDiff(nums1, nums2);
         System.out.println(ans);
    }
    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        if(Arrays.equals(nums1,nums2)){
            return 0;
        }
        int mod = (int)1e9+7;
      
        int[] secondNums1 = nums1.clone();
        
        Arrays.sort(secondNums1);
         
        int maxDiff = 0;
        int newNum1 = 0;
        int pos = 0;
        int sum =0;
    
        
        for(int i =0;i<nums2.length;i++){
            int n2 = nums2[i];
            int originalDiff = Math.abs(nums1[i] - n2);
            int floor = floorVal(secondNums1,n2);
            
            if(floor > Integer.MIN_VALUE){
    
                int newDiff = Math.abs(floor - n2);
                int diff = originalDiff - newDiff;
                if(diff > maxDiff){
                    newNum1 = floor;
                    pos = i;
                    maxDiff = diff;
                }
            }
            
            int ceil = ceilValue(secondNums1,n2);
            if(ceil < Integer.MAX_VALUE){
            int newDiff = Math.abs(ceil - n2);
            int diff = originalDiff - newDiff;
            if(diff > maxDiff){
                newNum1 = ceil;
                pos = i;
                maxDiff = diff;
            }
            }
            
        }
            
            if(newNum1 > 0){
                nums1[pos] = newNum1;
            }
            
            for(int i=0;i<nums1.length;i++){
                 sum = (sum + Math.abs(nums1[i] - nums2[i])) % mod;
            }
            
            return sum;
    }

    public static int floorVal(int[] arr,int val){
        int l=0;
        int h = arr.length - 1;
        int max = Integer.MIN_VALUE;
        while(l<=h){
            int mid = l + (h - l)/2;
            if(arr[mid] <= val){
                max = arr[mid];
                l = mid + 1;
            }else{
                h = mid -1;
            }
        }
        return max;
    }
    
    public static int ceilValue(int[] arr,int val){
        int l=0;
        int h = arr.length - 1;
        int min = Integer.MAX_VALUE;
        while(l<=h){
            int mid = l + (h - l)/2;
            if(arr[mid] >= val){
                min = arr[mid];
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return min;
    }
}
