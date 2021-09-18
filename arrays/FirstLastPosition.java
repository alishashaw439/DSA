import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLastPosition {
    public static void main(String args[]){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int N = nums.length;
        List<Integer> indexs = new ArrayList<>();
        int[] answer = {-1,-1};
        for(int i=0;i<N;i++){
            if(nums[i] == target){
                indexs.add(i);
        int min=indexs.get(0), max=indexs.get(0);
        for(int j=0;j<indexs.size();j++){
            if(indexs.get(j) < min){
                min = indexs.get(j);
            }
            if(indexs.get(j) > max){
                max =  indexs.get(j);
            }
        }
      
        answer[0] = min;
        answer[1] = max;
             }
        }
        
        return answer;
        
    }
}
