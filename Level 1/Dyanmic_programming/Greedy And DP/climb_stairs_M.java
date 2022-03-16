import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scn.nextInt();

        System.out.println(climbStairsMT(n,arr));

    }
    public static int climbStairsMT(int n,int[] arr){

        int[] dp = new int[n+1];
        dp[n]=1;

        for(int i=dp.length-2;i>=0;i--)
        {
            for(int j = i+1;j<=i+arr[i] && j<dp.length;j++)
                dp[i]+=dp[j];
        }
        return dp[0];
    }

}