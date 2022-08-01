public class nthpalindromic {
    
}
import java.io.*;
import java.util.*;

public class Main {

    public static int NthPalindromicBinary(int n) {
        //write your code here
        int len = 1;
        int count = 1;
        while(count<n){
            len++;
            count+=(1<<(len-1)/2);
        }
        count-=(1<<(len-1)/2);
        int offset = n-count-1;
        
        int ans = (1<<(len-1));
        ans |= (offset<<(len/2));
        
        int valFR = (ans>>(len/2));
        int rev  = getREV(valFR);
        ans |= rev;
        
        return ans;
    }
    public static int getREV(int n){
        int rev = 0;
        while(n!=0){
            int lb = (n & 1);
            rev|=lb;
            n>>=1;
            rev<<=1;
        }
        rev>>>=1;
        return rev;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(NthPalindromicBinary(n));
    }

}