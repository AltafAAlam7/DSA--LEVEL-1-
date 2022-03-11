import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    System.out.println(fib(n));
    
 }

 public static int fib(int n){
    
    int[] dp = new int[n+1];

    dp[0]=0;
    dp[1]=1;

    for(int i=2;i<=n;i++)
        dp[i]=dp[i-1]+dp[i-2];

    return dp[n];
 }

}