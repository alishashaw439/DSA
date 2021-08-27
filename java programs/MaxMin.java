public class MaxMin {
    public static void main(String args[]){
        int a=6,b=8,c=20;
        System.out.println("Max "+Max(a,b,c));
        System.out.println("Min "+Min(a,b,c));

    }
    public static int Max(int a,int b, int c){
        int max = Math.max(c,Math.max(a, b));
        return max;
    }
    public static int Min(int a,int b, int c){
        int min = Math.min(c,Math.min(a, b));
        return min;
    }
}
