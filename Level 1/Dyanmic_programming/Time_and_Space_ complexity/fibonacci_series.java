import java.util.Scanner;

public class fibonacci_series{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=0;i<n;i++)
        {
            int term = fib(i);
            System.out.print(term+" ");

        }
        scn.close();
    }
    public static int fib(int n)
    {
        if(n==0 || n==1)
            return n;
        
        int fibnm1= fib(n-1);
        int fibnm2 = fib(n-2);
        return fibnm1+fibnm2;
    }
}