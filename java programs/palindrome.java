import java.util.ArrayList;
import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        //method 1
    //     int number = 131,sum=0;
    //     int temp =number;
    //     while(number > 0){
    //         int rem = number % 10;
    //         sum = (sum*10)+rem;
    //         number /=10;
    //     }
    //    if(temp == sum){
    //     System.out.println("palindrome");
    //    }else{
    //     System.out.println("not palindrome");
    //    }

    //method 2
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string or number to check if it is palindrome or not");
    String input = sc.nextLine();
    int length = input.length();
    String reverse = "";
    for(int i=length -1;i>=0;i--){
      reverse = reverse + input.charAt(i);
    }
    if(input.equals(reverse)){
        System.out.println("palindrome");
    }else{
        System.out.println("not palindrome");
    }
    sc.close();
    
       
    }
}
