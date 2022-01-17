//https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1/#
//same as capacity of ship problem
public class AllocateMinNumPages {
    public static void main(String[] args){

    }

    public static int findPages(int[]A,int N,int M)
    {
        
        int l = Integer.MIN_VALUE;
        int h = 0;
        int res = -1;
        
        for(int n : A){
            h += n;
            if(n > l){
                l = n;
            }
        }
        
        while(l <= h){
            int mid = l + (h-l)/2;
            if(isPossible(A,M,mid)){
                res = mid;
                h = mid -1;
            }else{
                l = mid + 1;
            }
        }
        return res;
    }
    public static boolean isPossible(int[] A,int M,int mid){
        int students = 1;
        int sum = 0;
        for(int i=0;i<A.length;i++){
            sum += A[i];
            if(sum > mid){
                students++;
                sum = A[i];
            }
            if(students > M){
                return false;
            }
        }
        return true;
    }
}
