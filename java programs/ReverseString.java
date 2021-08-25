public class ReverseString {
    public static void main(String args[]){
        String str = "Alisha";
        //method 1
        // char[] s = str.toCharArray();
        // for(int i = s.length-1; i >= 0;i--){
        //     System.out.print(s[i]);
        // }
        //method 2
        char[] s = str.toCharArray();
        int left =0, right = s.length-1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            right--;
            left++;
        }
        for(char n : s){
            System.out.print(n);
        }

    }
    
}
