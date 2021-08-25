class Fibonacci{
    public static void main(String args[] ) {
        //iterative
        // int first = 0, second=1;
         int upTo=20;
        // for(int i=1;i<=upTo;i++){
        //     System.out.print(first+" ");
        //      int temp = second;
        //      second = second + first;
        //      first = temp;
           
        // }
        for(int i=0;i<upTo;i++){
            System.out.print(recurFib(i)+" ");
        }
 
       
    }
    public static int recurFib(int n){
        if(n <= 1){
            return n;
        }
        return recurFib(n-1) + recurFib(n-2);
    }
}