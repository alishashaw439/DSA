import java.util.*;
//https://leetcode.com/problems/intersection-of-two-arrays/submissions/
//has to be unique
public class IntersectionOfTwoArraysI {
    public static void main(String args[]){
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {

        //two pointer method with set, TC:O(nlogn) + O(mlogm)
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> set = new HashSet<>();
         List<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
           if(nums1[i] == nums2[j]){
             if(!set.contains(nums1[i])){
                set.add(nums1[i]);
                list.add(nums1[i]);

            }  i++;j++;
        }else if(nums1[i]<nums2[j]){
               i++;
           }else if(nums2[j]<nums1[i]){
               j++;
           }
            
    }
        int[] ans = new int[list.size()];
        
        for(int k=0;k<list.size();k++){
            ans[k] = list.get(k);
        }
        return ans;

        
        //second method
//         Set<Integer> set = new HashSet<>();
//         List<Integer> list = new ArrayList<>();
//         for(int n : nums1){
//             set.add(n);
//         }
        
//         for(int n : nums2){
//             if(set.contains(n)){
//                 list.add(n);
//                 set.remove(n);
//             }
//         }
//         int[] ans = new int[list.size()];
//         for(int i=0;i<list.size();i++){
//             ans[i] = list.get(i);
//         }
//         return ans;
        
        
        
        
        //third method
//         HashSet<Integer> set1 = new HashSet<>();
//         HashSet<Integer> set2 = new HashSet<>();
//         for(int n : nums1){
//             set1.add(n);
//         }
//         for(int n : nums2){
//             set2.add(n);
//         }
//         if(set1.size() < set2.size()){
//             return set_intersection(set1,set2);
//         }else{
//             return set_intersection(set2,set1);
//         }
        
    
//     public int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2){
//         int[] result = new int[set1.size()];
//         int index = 0;
//         for(int n : set1){
//             if(set2.contains(n)){
//                 result[index++] = n;
//             }
//         }
//         return Arrays.copyOf(result,index);
    }
}
