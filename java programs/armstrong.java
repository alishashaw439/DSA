public class armstrong {
    public static void main(String args[]){
        int n = 153;
        int originalNum=n;
        int sum = 0;
        while(originalNum > 0){
            int digit = originalNum % 10;
            sum += Math.pow(digit,3);
            originalNum /= 10;
        }
        if(sum == n){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
