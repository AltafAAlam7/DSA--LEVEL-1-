import java.io.*;
import java.util.*;

public class Main {
    public static long ncr(long n, long r){
        if(n < r){
            return 0L;    
        }
        
        long res = 1L;
        
        for(long i = 0L; i < r; i++){
            res = res * (n - i);
            res = res / (i + 1);
        }
        
        return res;
    }
    
    public static long solution(long n, int k, int i) {
      
        if(i==0)
            return 0;
        
        long ans = 0L;
        long mask = (1L<<i);
        
        if((mask & n)==0){
            ans+=solution(n,k,i-1);
        }
        else{
            ans+=ncr(i,k);
            ans+=solution(n,k-1,i-1);
        }
        
        return ans;
    }
    
    public static int csb(long n){
        int res = 0;
        
        while(n > 0){
            long rsb = n & -n;
            n -= rsb;
            res++;
        }
        
        return res;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        int k = csb(n);
        System.out.println(solution(n, k, 63));
    }
	
	
}