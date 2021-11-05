import java.util.*;
//https://leetcode.com/problems/kth-missing-positive-number/
public class kthpositiveInteger {
    
    public static void main(String args[]){
       int[] array ={2,3,4,7,11};
       int k = 5;
       System.out.println(findKthPositive(array, k));
    }
    public static int findKthPositive(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        int counter = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == counter){
                counter++;
            }else{
                list.add(counter);
                counter++;
                i--;
            }
        }
        System.out.println(list);
        if(k > list.size()){
            return arr[arr.length - 1] + (k - list.size());
        }else{
            return list.get(k-1);
        }
    
        
    }
}
