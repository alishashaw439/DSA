public class Leap {
    public static void main(String args[]){
        int n = 2014;
      
        boolean ans = isLeap(n);
        System.out.println("Ans"+ans);

    }
    public static boolean isLeap(int num){

        if(num % 400 == 0){
            return true;
        }
        if(num % 4 == 0 && num % 100 !=0){
            return true;
        }
        return false;
       
    }
}
