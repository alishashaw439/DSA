import java.util.Scanner;
class Prime{
    public static void main(String args[] ) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        if(num % 2 == 0){
            System.out.println("even!");
        }else{
            System.out.println("odd!");
        }
    }
}