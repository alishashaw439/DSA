//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class CapacityToShip {
    public static void main(String[] args){
      int[] weights = {3,2,2,4,1,4};
      int days = 3;
      System.out.println(shipWithinDays(weights, days));
    }
    public static int shipWithinDays(int[] weights, int days) {
        if(weights.length < days){
            return -1;
        }
        int l = Integer.MIN_VALUE;
        int h = 0;
        int res = -1;
        
        for(int n : weights){
           h += n;
           if(n > l){
               l = n;
           }
        }

        while(l <= h){
            int mid = l + (h - l)/2;
            
            if(isPossible(weights,days,mid)){
                res = mid;
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        
      return res;
    }
    static boolean isPossible(int[] arr,int days, int mid){
        int capacity = 1;
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum > mid){
                capacity++;
                sum = arr[i];
            }
            if(capacity > days){
                return false;
            }
        }
        
        return true;
    }
}
