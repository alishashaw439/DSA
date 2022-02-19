import java.util.Arrays;
//only applicable for range 1 to N
public class CyclicSort {
    public static void main(String args[]){
        int[] array = {6,1,4,3,5,2};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array){
        for(int i=0;i<array.length;i++){
            int index = array[i] - 1;
            if(array[i] != array[index]){
               swap(array,i,index);
            }
        }
    }
  

    public static void swap(int[] array,int n1,int n2){
        int temp = array[n1];
        array[n1] = array[n2];
        array[n2] = temp;
    }

    
}
