public class Leap {
    public static void main(String args[]){
        int n = 2028;
        if((n % 400 == 0) || (n % 4 == 0) && (n % 100 !=0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a Leap year");
        }

    }
}
