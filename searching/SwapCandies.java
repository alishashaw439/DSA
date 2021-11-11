import java.util.Arrays;

public class SwapCandies {
    public static void main(String args[]){
         int[] alice ={1,2,5};
         int[] bob = {2,4};
         System.out.println(Arrays.toString(fairCandySwap(alice, bob)));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        //let x be the number of candies that alice gives
        // let y be the number of candies that bob gives
        // Sa - x + y = Sb - y + x
        //Sa - Sb + 2y = 2x
        //y = x + (Sb-Sa)/2
        
        int sumA = 0, sumB = 0;
        for(int n : aliceSizes){
            sumA +=n;
        }
        for(int n : bobSizes){
            sumB +=n;
        }
        
        int diff = (sumB - sumA)/2;
        
//         Set<Integer> set = new HashSet<>();
        
//         for(int n : bobSizes){
//             set.add(n);
//         }
//         for(int n : aliceSizes){
//             if(set.contains(n+diff)){
//                 return new int[] {n,n+diff};
//             }
//         }
//         return new int[] {0,0};

        
        int[] ans = new int[2];
        Arrays.sort(bobSizes);
        for(int i=0;i<aliceSizes.length;i++){
            sumA += aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++){
            sumB += bobSizes[i];
        }
        for(int i=0;i<aliceSizes.length;i++){
            int l=0,r=bobSizes.length-1;
            int x = aliceSizes[i] + diff;
            while(l<=r){
                int mid = l+(r-l)/2;
                if(bobSizes[mid] == x){
                    ans[1] = bobSizes[mid];
                    ans[0] = aliceSizes[i];
                    return ans;
                }else if(bobSizes[mid] < x){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
        }
        return ans;
    }
}
