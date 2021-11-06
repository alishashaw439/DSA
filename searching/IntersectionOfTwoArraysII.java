import java.util.*;
//https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class IntersectionOfTwoArraysII {
    public static void main(String args[]){
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        //to make sure nums1 is always of size smaller
        // if(nums1.length > nums2.length){
        //     return intersect(nums2,nums1);
        // }
        // List<Integer> list = new ArrayList<>();
        // HashMap<Integer,Integer> map = new HashMap();
        // for(int n : nums1){
        //     map.put(n,map.getOrDefault(n,0)+1);
        // }
        // for(int n : nums2){
        //     int count = map.getOrDefault(n,0);
        //     if(count > 0){
        //         list.add(n);
        //         map.put(n,count-1);
        //     }
        // }
        // int[] arr = new int[list.size()];
        // int i =0;
        // for(int n : list){
        //     arr[i++]=n;
        // }
        // return arr;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        
        int i=0;
        int j=0;
        List<Integer> list = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
            
            
            
        }
        int[] arr = new int[list.size()];
        int k =0;
        for(int n : list){
            arr[k++]=n;
        }
        return arr;
        
}
}
