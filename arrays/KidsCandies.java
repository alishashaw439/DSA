import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
//Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
//Note that multiple kids can have the greatest number of candies.


public class KidsCandies {
    public static void main(String args[]){
        int[] candies = {2,3,5,1,3};
        int n =3;
        System.out.println(kidsWithCandies(candies,n));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int i=0;i<candies.length;i++){
            max = max >= candies[i] ? max : candies[i];
        }
        for(int j=0;j<candies.length;j++){
            result.add(candies[j]+extraCandies >= max ? true : false);
        }
        return result;
    }
}
