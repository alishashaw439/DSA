public class SumOfNaturalNumbers {
    public static void main(String args[]){
        int n = 100;
       System.out.println(sumNaturalNums(n));
    }
    public static int sumNaturalNums(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
           sum += i;
        }
        return sum;
    }
    
}
