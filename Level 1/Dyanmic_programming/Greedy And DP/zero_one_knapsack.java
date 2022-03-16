import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] values = new int[n];
        for(int i=0;i<n;i++)
            values[i] = scn.nextInt();

        int[] wts = new int[n];
        for(int i=0;i<n;i++)
            wts[i] = scn.nextInt();

        int cap = scn.nextInt();

        System.out.println(zero_one_knapsack(values,wts,cap));
    }
    public static int zero_one_knapsack(int[] values, int[] wts, int cap){

        int[][] dp = new int[values.length+1][cap+1];

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){

                int idx  = i-1;

                if(j<wts[idx])
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-wts[idx]] + values[idx]);
            }
        }

        return dp[values.length][cap];

    }
}