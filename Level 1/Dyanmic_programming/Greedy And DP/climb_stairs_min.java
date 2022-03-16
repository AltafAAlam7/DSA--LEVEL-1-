import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws Exception
    {   
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scn.nextInt();

        System.out.println(climbStairsMinT(n,arr));
    }
    public static int climbStairsMinT(int n ,int[] arr)
    {
        int[] dp = new int[n+1];
        dp[n]=1;

        for(int i=dp.length-2;i>=0;i--)
        {
            int min = Integer.MAX_VALUE;
            for(int j = i+1;j<=i+arr[i] && j<dp.length;j++)
            {
                if(dp[j]<min)
                    min=dp[j];
            }
            dp[i]= min;
        }
        return dp[0];
    }
}
