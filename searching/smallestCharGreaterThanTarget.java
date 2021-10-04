public class smallestCharGreaterThanTarget {
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String args[]){
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        //         char ans=target;
        //         for(char i=0;i<letters.length;i++){
        //             if(Character.compare(letters[i],target) > 0){
        //                 ans = letters[i];
        //                 return ans;
        //             }
                    
                  
        //         }
        //         return ans;
                
                int low =0;
                int high = letters.length-1;
                while(low<=high){
                    int mid = low + (high - low)/2;
                    if(letters[mid]<=target){
                        low = mid+1;
                    }else{
                        high = mid-1;
                    }
                }
                return letters[low % letters.length];
            }
}
