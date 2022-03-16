import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(climbStairs(n,new int[n+1]));
        
    }
    public static int climbStairs(int n,int[] strg)
    {

        if(n==0||n==1)
            return 1;
        else if(n<0)
            return 0;
        else if(strg[n]!=0)
            return strg[n];
        int path1 = climbStairs(n-1,strg);
        int path2 = climbStairs(n-2,strg);
        int path3 = climbStairs(n-3,strg);

        int path  = path1+path2+path3;
        strg[n] = path;

        return path;
    }

    public static int climbStairsT(int n)
    {
        int[] dp = new int[n+1];

        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++)
        {
            if(i-3>=0)
                dp[i]+=dp[i-3];

            dp[i]+=dp[i-2]+dp[i-1];
             
        }
        return dp[n];
    }

}