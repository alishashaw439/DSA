import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddArrayToIntegerToArray {
    public static void main(String args[]){
        int[] num = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(num,k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        //       method 1: doesn't work with array length of more or equal to 10
                
        //        int sum=0,arrayNum=0;
        //         List<Integer> list = new ArrayList<Integer>();
                
        //         for(int i=0;i<num.length;i++){
        //             arrayNum = arrayNum*10 + num[i];
        //         }
                
        //         sum = arrayNum + k;
        //         while(sum >0){
        //             int digit = sum % 10;
        //             sum /=10;
        //             list.add(digit);
        //         }
        //         Collections.reverse(list);
        //         return list;
                 List<Integer> list = new ArrayList<Integer>();
                 int current = k, i = num.length;
                while(--i>=0 || current > 0){
                    if(i>=0){
                        current += num[i];
                    }
                    list.add(current % 10);
                     current /=10;
                }
                Collections.reverse(list);
                return list;
                
            }
}
