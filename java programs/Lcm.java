public class Lcm {
   public static void main(String args[]){
        int num1 = 25;
        int num2 = 65;
        int lcm = 0;
        int hcf = 0;
        int temp1 = num1;
        int temp2 = num2;

        while(temp2 != 0){
            int temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }
      hcf = temp1;
      lcm = (num1 * num2)/hcf;
      System.out.println("lcm \n" + lcm);
      System.out.println("hcf\n" + hcf);

   }
}
