public class guessNumberHigherOrLower {
    
    public static void main(String args[]){
        System.out.println(guessNumber(20));
    }
    public static int guessNumber(int n) {
        // for(int i=1;i<n;i++){
        //     if(guess(i) == 0){
        //         return i;
        //     }
        // }
        // return n;
        
        int start = 1;
        int end = n;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(guess(mid) == 0){
                return mid;
            }else if(guess(mid ) == -1){
                end = mid-1;
            }else if(guess(mid) == 1){
                start = mid+1;
            }
        }
        return -1;
    }
    public static int guess(int num){
        int pick = 10;
        if(pick == num){
            return 0;
        }else if(pick < num){
            return -1;
        }else if(pick > num){
            return 1;
        }

        return num;
    }
}
