import java.util.Arrays;

//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

public class UniqueIntSumZero {
    public static void main(String args[]){
        int n =5;
        System.out.println(Arrays.toString(sumZero(n)));

    }
    public static int[] sumZero(int n) {
        int[] ans = new int[n];
        //method 1

    //     int sum =0;
    //     for(int i=0;i<n;i++){
    //         ans[i] = i;
    //         sum +=ans[i];
    //     }
    //     ans[0] = sum * -1;
    //     return ans;
    // }
    //method 2
        for(int i=0;i<n-1;i +=2){
            ans[i] = i+1;
            ans[i+1] = -(i+1);
        }
        return ans;
}
}
