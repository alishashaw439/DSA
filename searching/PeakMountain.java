//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakMountain {
    public static void main(String args[]) {
         int[] arr = {3,4,5,1};
         System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {

        // method 1
        // for(int i=1;i<arr.length;i++){
        // if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
        // return i;
        // }
        // }
        // return 0;

        // method 2
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]) { // increasing
                low = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                high = mid; // decreasing
            }

        }
        return low;
    }
}
