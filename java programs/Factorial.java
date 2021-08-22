public class Factorial {
    public static void main(String args[]){
        int num = 20;
        int ans = factorial(num);
        System.out.println(ans);
    }
    public static int factorial(int num){
          int fact=1;
          if(num == 0){
            fact = 1;
          }
          for(int i=1;i<num;i++){
              fact = fact * (num-i);
          }
          int ans = fact*num;
          return ans;
    }
}
