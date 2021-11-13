import java.util.Arrays;
//https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class CheckNandDouble {
    public static void main(String args[]){
       int[] arr = {10,2,5,3};
       System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);
       // 1 2 5 10
        for(int i=0;i<arr.length;i++){
        int l=0;
        int h=arr.length-1;
            while(i<arr.length && l<=h){
            int mid = l+(h-l)/2;
                if(i==mid){
                    l=mid+1;
                    continue;
            }else if(arr[mid]<arr[i]*2){
                l = mid+1;
            }else if(arr[mid]>arr[i]*2){
                h = mid-1;
            }else{
                return true;
            }
        }
    }
        
        return false;
    }
}
