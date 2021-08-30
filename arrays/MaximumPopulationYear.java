//https://leetcode.com/problems/maximum-population-year/
public class MaximumPopulationYear {
    public static void main(String args[]){
        int[][] logs = {{1993,1999},{2000,2010}};
        System.out.println(maximumPopulation(logs));

    }
    public static int maximumPopulation(int[][] logs) {
        int[] alive = new int[101];
        for(int i=0;i<logs.length;i++){
            int start = logs[i][0];
            int end = logs[i][1];
            for(int j= start - 1950;j< end - 1950;j++){
                alive[j]++;
            }
        }
        int max = 0;
        int year = 0;
        for(int i=0;i<alive.length;i++){
            if(alive[i] > max){
                max = alive[i];
                year = i;
            }
        }
        return year + 1950;
    }
}
