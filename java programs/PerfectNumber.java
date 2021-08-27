public class PerfectNumber {
    public static void main(String[] args){
        int n = 6;
       System.out.println(isPerfect(n));
    }
    public static boolean isPerfect(int n){
        int i=1,sum=0;
        while(i<n){
            if(n%i==0){
                sum += i;
            }
            i++;
        }
        return (sum == n);
    }
}
