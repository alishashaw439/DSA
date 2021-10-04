public class validPerfectSquare {
    
    public static void main(String args[]){
        int num = 16;
         System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        // double ans = Math.sqrt(num);
        // double floorValue = Math.floor(ans);
        // return (ans - floorValue) == 0;
        
        //let square root of num = y
        //num = y^2
        //find y
        
        long start = 1;
        long end = num;
        while(start <= end){
            long mid = start + (end-start)/2;
            if(mid * mid == num){
                return true;
            }else if(mid * mid < num){
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}
