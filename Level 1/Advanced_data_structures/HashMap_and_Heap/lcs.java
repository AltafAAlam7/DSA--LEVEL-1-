import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n  = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++)
        arr[i]=scn.nextInt();
    
    HashMap<Integer,Boolean> map = new HashMap<>();

    for(int val: arr)
        map.put(val,true);
    
    for(int val:arr)
    {
        if(map.containsKey(val-1))
            map.put(val, false);
        
    }

    int mval = 0;
    int mlen = 0;
    for(int val:arr)
    {
        if(map.containsKey(val))
        {
            int tval = val;
            int tlen = 1;

            while(map.containsKey(tval+tlen)==true)
                tlen++;
            
            if(tlen>mlen)
            {
                mlen=tlen;
                mval=tval;
            }
        }
    }
    for(int i=0;i<mlen;i++)
    System.out.println(mval+i);
 }

}