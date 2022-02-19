import java.util.Arrays;

public class BubbleSort {
    

public static void main(String args[]){
    int[] array = {5,9,34,1,23};
    sort(array);
    System.out.println(Arrays.toString(array));
}

public static void sort(int[] array){
    for(int i=0;i<array.length;i++){
        for(int j=1;j<array.length-i;j++){
            if(array[j] < array[j-1]){
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
            }
        }
    }

}



}
