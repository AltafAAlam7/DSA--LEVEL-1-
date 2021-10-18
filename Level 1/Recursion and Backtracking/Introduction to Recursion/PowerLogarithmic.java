import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        int xPn=power(x, n);
        System.out.println(xPn);
        scn.close();
    }

    public static int power(int x, int n){
        
        if(n==0)
            return 1;
        
        int xn2= power(x, n/2);
        int xn = xn2 * xn2;

        if(n%2!=0)
            xn = x * xn;
        return xn;
    }
}