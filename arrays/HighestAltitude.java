//https://leetcode.com/problems/find-the-highest-altitude/

public class HighestAltitude {
    public static void main(String args[]){
        int[] gain ={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        //method 1

        //       int sum =0,k=1,max=0;
        //       int[] alt = new int[gain.length+1];
        //       for(int i=0;i<gain.length;i++){
        //           sum += gain[i];
        //           alt[k++] = sum;
        //       }
        //       for(int j=0;j<alt.length;j++){
        //           if(max < alt[j]){
        //               max = alt[j];
        //           }else{
        //               max = max;
        //           }
        //       }
        // return max;

        //method 2
              int max=0,currentAlt=0;
              for(int i=0;i<gain.length;i++){
                  currentAlt += gain[i];
                  if(currentAlt > max){
                      max = currentAlt;
                  }
              }
              return max;
              
          }
}
