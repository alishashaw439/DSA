public class NcrandNpr {
    public static void main(String args[]){
        int n = 5, r=2;
        if(n>=r){
            System.out.println("NCR "+ncr(n,r));
            System.out.println("NPR "+npr(n,r));
        }else{
            System.out.println("n value should be greater than r");
        }
       
    }
    public static int ncr(int n, int r){
        int com = fact(n)/(fact(n-r)*fact(r));
        return com;
    }
    public static int npr(int n, int r){
        int per = fact(n)/fact(n-r);
        return per;
    }
    public static int fact(int n){
        int fact =1, i=1;
        while(i<=n){
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
