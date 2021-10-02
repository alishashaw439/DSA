public class firstBadVersion {
    public static void main(String args[]){
        System.out.println(firstbadVersion(5));
    }

    public static int firstbadVersion(int n) {
        int start = 1;
        int end = n;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(isBadVersion(mid)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
        
        
        
        // for(int i=1;i<n;i++){
        //     if(isBadVersion(i)){
        //         return i;
        //     }
        // }
        // return n;
    }

    public static boolean isBadVersion(int num){
        int[] isBadVersions = {0,0,0,1,1,1,1,1};
        for(int i=0;i<isBadVersions.length;i++){
             if(isBadVersions[num-1] == 1){
                 return true;
             }
        }
        return false;
    }
}
