import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
        int[] array = {5,9,34,1,23,78,237,853,8,2};
        sort(array);
        System.out.println(Arrays.toString(array));
        }

        public static void sort(int[] array){
           for(int i=0;i<array.length;i++){
               int lastIndex=array.length-i-1;
               int maxIndex = getMaxIndex(array,0,lastIndex);
               swap(array,maxIndex,lastIndex);
           }
        }

        public static int getMaxIndex(int[] arr,int start,int end){
            int max=start;
            for(int i=start;i<=end;i++){
                if(arr[max] < arr[i]){
                     max=i;
                }
            }
            return max;
        }

        public static void swap(int[] array,int n1,int n2){
            int temp = array[n1];
            array[n1] = array[n2];
            array[n2] = temp;
        }
}
