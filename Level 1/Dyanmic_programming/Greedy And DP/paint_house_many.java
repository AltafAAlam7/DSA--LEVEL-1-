import java.io.*;
import java.util.*;

public class Main {

    public static class Pair{
        int first;
        int second;

    }


    public static Pair maximums(int[][] dp , int i){

        Pair p = new Pair();
        
        if(dp[0].length<1){
            p.first = dp[i][0];
            p.second = dp[i][0];
            
            return p;
        }
        
        p.first = Math.min(dp[i][0],dp[i][1]);
        if(p.first == dp[i][0])
            p.second = dp[i][1];
        else
            p.second = dp[i][0];
        
        for(int j=2;j<dp[0].length;j++)
        {
            if(dp[i][j]<= p.first){
                p.second = p.first;
                p.first = dp[i][j];
               
            }
            else if(dp[i][j] <= p.second)
                p.second = dp[i][j];
        }

        return p;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int[][] cost = new int[n][k];

        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                cost[i][j] = scn.nextInt();
            }
        }

        System.out.println(paint_house(cost));
    }
    public static int paint_house(int[][] cost){
        
        int n = cost.length;
        int k = cost[0].length;

        int[][] dp = new int[n][k];

        //intialize
        for(int j=0;j<dp[0].length;j++)
            dp[0][j] = cost[0][j];

        for(int i=1;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){

                Pair p = maximums(dp,i-1);

                if(p.first == dp[i-1][j])
                    dp[i][j] = p.second + cost[i][j];
                else
                    dp[i][j] = p.first + cost[i][j];
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<k;j++)
        //         System.out.print(dp[i][j]+" ");
            
        //     System.out.println();
        // }
        int minCost = dp[n-1][0];

        for(int j=1;j<dp[0].length;j++){
            
            if(dp[n-1][j] < minCost)
                minCost = dp[n-1][j];
        }
        return minCost;
    }
}