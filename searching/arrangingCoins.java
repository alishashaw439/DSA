public class arrangingCoins {
   // https://leetcode.com/problems/arranging-coins/
    public static void main(String args[]) {
        int coin = 8;
        System.out.println(arrangeCoins(coin));
    }

    public static int arrangeCoins(int n) {
        // int i=1;
        // int count =0;
        // while(n>=0){
        // n = n-i;
        // count++;
        // i++;
        // }
        // return count -1;




        // 1+2+3...K = k(k+1)/2
        // k(k+1)/2 <= N

        long start = 0;
        long end = n;

        while (start <= end) {
            long k = start + (end - start) / 2;
            long ans = k * (k + 1) / 2; // number of coins

            if (ans == n) {
                return (int) k;
            }
            if (ans > n) {
                end = k - 1;
            } else if (ans < n) {
                start = k + 1;
            }
        }
        return (int) end;
    }
}
