import java.util.Scanner;
class Prime{
    public static void main(String args[] ) {
        // Scanner in = new Scanner(System.in);
        // int num = in.nextInt();
        // in.close();
        // if(num % 2 == 0){
        //     System.out.println("even");
        // }else{
        //     System.out.println("odd");
        // }

        int n = 7, flag = 0; 
        if(n == 0 || n == 1){
            System.out.println("Not a prime number");
        }else{
            for(int i = 2;i<=n/2;i++){
                if(n % i == 0){
                 System.out.println("Not a prime number");
                 flag=1;
                 break;
                }
            }
            if(flag==0){
                System.out.println("Prime number");
            }
        }
      
    }
}