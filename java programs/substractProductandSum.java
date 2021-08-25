public class substractProductandSum {
    public static void main(String args[]){
        int number = 234;
        System.out.println(substract(number));

    }
    public static int substract(int n){
        int product =1;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n /=10;
        }
        return (product - sum);
    }
}
