public class sqrtOfX {
    //https://leetcode.com/problems/sqrtx/submissions/
    public static void main(String args[]){
        int x = 8;
        System.out.println(sqrt(x));
    }
    public static int sqrt(int x){
         //sqrt(x) = y
        // x = y^2
        //find y
        
        int start = 1;
        int end = x;
        
        if(x<2){
            return x;
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if((long)mid * mid == x){
                return mid;
            }else if((long)mid * mid < x){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return end;
    }
}
