import java.util.Scanner;

class SumOfAllNumbers{
    public static void main(String args[]){
        int sum=0;
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
             while(input != 0){
                    sum = sum + input;
                    input = in.nextInt();
             }
             System.out.println(sum);
             in.close();
    }
}