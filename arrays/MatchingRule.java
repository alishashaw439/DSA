import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/count-items-matching-a-rule/

public class MatchingRule {
    public static void main(String args[]){
        List<List<String>> list = Arrays.asList(Arrays.asList("phone","blue","pixel"), Arrays.asList("computer","silver","lenovo"), Arrays.asList("phone","gold","iphone"));
        String ruleKey = "color", ruleValue = "silver";
        System.out.println(countMatches(list,ruleKey,ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0,j=0;
        if(ruleKey.equals("type"))
            j=0;
        if(ruleKey.equals("color"))
            j=1;
         if(ruleKey.equals("name"))
             j=2;
        
        for(List<String> item : items){
              if(item.get(j).equals(ruleValue)){
                  count++;
              }
        }
        return count;
    }
}
